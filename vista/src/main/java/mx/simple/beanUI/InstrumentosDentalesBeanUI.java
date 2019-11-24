package mx.simple.beanUI;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.simple.entidad.Instrumentodental;

import mx.simple.helper.InstrumentosDentalesHelper;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Gabriel Rodriguez
 */
@ManagedBean(name = "instrumentosDUI")
@SessionScoped
public class InstrumentosDentalesBeanUI implements Serializable {

    private InstrumentosDentalesHelper instrumentosDentalesHelper;
    private Instrumentodental instrumentoDental;
    private Instrumentodental instrumentoSelect;
    private List<Instrumentodental> cities;
    static List<Instrumentodental> cities2;
    static List<Instrumentodental> ins;

    public InstrumentosDentalesBeanUI() throws IOException {
        instrumentosDentalesHelper = new InstrumentosDentalesHelper();
        instrumentoDental = new Instrumentodental();
        cities2 = Consulta();

    }

    @PostConstruct
    public void init() {
        instrumentoDental = new Instrumentodental();
    }

    public void actu() throws IOException {
        cities2 = Consulta();
    }

    public void registro() {
        instrumentoDental.setIDInstrumento(1);
        if (instrumentoDental.getDescripcion().isEmpty()) {
            instrumentoDental.setDescripcion("NA");
        }
        instrumentosDentalesHelper.Registro(instrumentoDental);
    }

    public void modificar(Instrumentodental instrumentoDental) throws IOException {
        instrumentosDentalesHelper.Modificar(instrumentoDental);
        FacesMessage msg = new FacesMessage("Instrumento Editado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void eliminar() {
        instrumentosDentalesHelper.Eliminar(instrumentoSelect);
        cities2 = Consulta();

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Eliminacion exitosa."));
    }

    // Metodo para mostrar mensaje de modificacion de paciente exitosa
    public void onRowEdit(RowEditEvent event) throws IOException {
        FacesMessage msg = new FacesMessage("Instrumento Editado");
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    // Metodo para mostrar mensaje de cancelacion de modificacion de paciente
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion cancelada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public List<Instrumentodental> Consulta() {
        List< Instrumentodental> Ins = instrumentosDentalesHelper.Consulta();
        return Ins;
    }

    //public List<String> Consulta2(){
    //   List < Instrumentodental> Ins = instrumentosDentalesHelper.Consulta();
    //  cities = new ArrayList<>();
    //for (Instrumentodental In : Ins) {
    //   cities.add(In.getProducto());
    // }
    //return cities;//
    // }
    public List<Instrumentodental> getCities() {
        return cities;
    }

    public void setCities(List<Instrumentodental> cities) {
        this.cities = cities;
    }

    public List<Instrumentodental> getCities2() {
        return cities2;
    }

    public void setCities2(List<Instrumentodental> cities2) {
        this.cities2 = cities2;
    }

    public InstrumentosDentalesHelper getInstrumentosDentalesHelper() {
        return instrumentosDentalesHelper;
    }

    public void setInstrumentosDentalesHelper(InstrumentosDentalesHelper instrumentosDentalesHelper) {
        this.instrumentosDentalesHelper = instrumentosDentalesHelper;
    }

    public Instrumentodental getInstrumentoDental() {
        return instrumentoDental;
    }

    public void setInstrumentoDental(Instrumentodental instrumentoDental) {
        this.instrumentoDental = instrumentoDental;
    }

    public Instrumentodental getInstrumentoSelect() {
        return instrumentoSelect;
    }

    public void setInstrumentoSelect(Instrumentodental instrumentoSelect) {
        this.instrumentoSelect = instrumentoSelect;
    }

    public List<Instrumentodental> getIns() {
        return ins;
    }

    public void setIns(List<Instrumentodental> ins) {
        this.ins = ins;
    }

    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Registro exitoso"));
    }
}
