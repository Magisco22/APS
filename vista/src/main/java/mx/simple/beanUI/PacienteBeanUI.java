/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.beanUI;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.simple.entidad.Paciente;
import mx.simple.helper.PacienteHelper;
import org.primefaces.PrimeFaces;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author luisc
 */

@ManagedBean(name = "pacienteUI")
@SessionScoped
public class PacienteBeanUI implements Serializable {

    private PacienteHelper pacienteHelper;
    private Paciente paciente;
    private List<Paciente> pac;
    static List<Paciente> pac2;
    private List<Paciente> filtro;
    private Paciente pacienteSelect;
  

    Date now = new Date(System.currentTimeMillis());
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    String fecha;
    Date fecha2;

    public PacienteBeanUI() throws IOException {
        pacienteHelper = new PacienteHelper();
        paciente = new Paciente();
        pac2 = consulta();
    }

    /**
     * Metodo postconstructor todo lo que este dentro de este metodo sera la
     * primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init() {
        paciente = new Paciente();
    }

    public void actu() throws IOException {
        pac2 = consulta();
    }

  
    //Metodo de registro de pacientes 
    public void registro() throws IOException {
        // los atributos de usuario vienen del xhtml
        // Se asigna id nuevo
        int ban=0;
        for (Paciente pac21 : pac2) {
            if( (paciente.getNombre().equals(pac21.getNombre()))&&(paciente.getTelefono().equals(pac21.getTelefono())) ){
                ban=1;
            }
        }
        if(ban != 1){
        
            paciente.setIDPaciente(1);
            paciente.setFechaDeNacimiento(Date.valueOf(fecha));
            paciente.setFechaDeRegistro(Date.valueOf(date.format(now)));
            if(paciente.getAseguranza() == false){
                paciente.setNumeroDeSeguro(0);
            }
            if(paciente.getDomicilio().isEmpty()){
                paciente.setDomicilio("NA");
            }
            //llama al metodo de registro de paciente helper
            pacienteHelper.Registro(paciente);
            saveMessage();
        }else{
            pacienteRepetido();
        }
    }

    //Método de registro de pacientes sin aseguranza
    public void sinAseguranza() throws IOException {
        // los atributos de usuario vienen del xhtml 
        // Se asigna id nuevo 
        paciente.setIDPaciente(1);
        paciente.setFechaDeNacimiento(Date.valueOf(fecha));
        paciente.setFechaDeRegistro(Date.valueOf(date.format(now)));
        paciente.setNumeroDeSeguro(1);
        //llama al metodo de registro de paciente helper
        pacienteHelper.Registro(paciente);
    }

    //Metodo de Eliminacion de Paciente
    public void eliminar() throws IOException {

        pacienteHelper.eliminar(pacienteSelect);
    }

    //Metodo para de consulta general de paciente
    public List<Paciente> consulta() throws IOException {
        List<Paciente> pa = pacienteHelper.Consulta();
        return pa;
    }

    public void modificar(Paciente paciente) throws IOException {
        pacienteHelper.modificar(paciente);
        FacesMessage msg = new FacesMessage("Paciente Editado.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void registrar() {
        String appURL = "/index.xhtml";

    }

    /* getters y setters*/

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Paciente> getFiltro() {
        return filtro;
    }

    public void setFiltro(List<Paciente> filtro) {
        this.filtro = filtro;
    }

    public List<Paciente> getPac() {
        return pac;
    }

    public void setPac(List<Paciente> pac) {
        this.pac = pac;
    }

    public Paciente getPacienteSelect() {
        return pacienteSelect;
    }

    public void setPacienteSelect(Paciente pacienteSelect) {
        this.pacienteSelect = pacienteSelect;
    }

    public List<Paciente> getPac2() {
        return pac2;
    }

    public void setPac2(List<Paciente> pac2) {
        this.pac2 = pac2;
    }
   
    public void reset() {
        PrimeFaces.current().resetInputs("registroPac");
    }
    //Metodo para inicializar un nuevo mensaje growl en primefaces
    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Registro exitoso."));
    }
    
    //Metodo para inicializar un nuevo mensaje growl en primefaces
    public void actualizaMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Tabla Actualizada."));
    }
    
     public void pacienteRepetido() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Paciente ya registrado."));
    }

    // Metodo para mostrar mensaje de modificacion de paciente exitosa

    public void onRowEdit(RowEditEvent event) throws IOException {
        FacesMessage msg = new FacesMessage("Paciente Editado.");
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    // Metodo para mostrar mensaje de cancelacion de modificacion de paciente
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edición Cancelada.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    // Metodo para actualizar campo de tabla modificacion de paciente con nuevo valor 
    public void onCellEdit(CellEditEvent event) throws IOException {

        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

}