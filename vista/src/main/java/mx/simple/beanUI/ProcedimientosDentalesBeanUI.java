package mx.simple.beanUI;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
import mx.simple.entidad.Procedimientodental;
import mx.simple.entidad.Instrumentodental;
import mx.simple.beanUI.InstrumentosDentalesBeanUI;
import mx.simple.helper.ProcedimientosDentalesHelper;
/**
 *
 * @author Gabriel Rodriguez
 */
@ManagedBean(name = "pDentalesUI")
@SessionScoped
public class ProcedimientosDentalesBeanUI implements Serializable {
    private ProcedimientosDentalesHelper procedimientosHelper;
    private Procedimientodental pd;
    private List<Procedimientodental> Pro;
    private List<Instrumentodental> ins;
private List<String> cities;
   private String[] selectedCities; 
   
    
    
    public ProcedimientosDentalesBeanUI() throws IOException{
        procedimientosHelper = new ProcedimientosDentalesHelper();
        pd = new Procedimientodental();
       
       
        
        }
    
    
      @PostConstruct
    public void init(){
        pd= new Procedimientodental();     
       
    
        
    }

    
    
      public void registro(){
     
      
        pd.setIDProcedimiento(2);
         procedimientosHelper.Registro(pd);
        
        
    }
    
    
    
    
    public List<Instrumentodental> getIns() {
        return ins;
    }

    public void setIns(List<Instrumentodental> ins) {
        this.ins = ins;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public String[] getSelectedCities() {
        return selectedCities;
    }

    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
    
    
    
   

    

  
    public void EliminarID() throws IOException {
        procedimientosHelper.Eliminar(pd);
    }
    
    public List <Procedimientodental> Consulta(){
        List <Procedimientodental> pde = procedimientosHelper.Consulta();
        return pde;
    }

    public ProcedimientosDentalesHelper getProcedimientosHelper() {
        return procedimientosHelper;
    }

    public void setProcedimientosHelper(ProcedimientosDentalesHelper procedimientosHelper) {
        this.procedimientosHelper = procedimientosHelper;
    }

   

    public Procedimientodental getPd() {
        return pd;
    }

    public void setPd(Procedimientodental pd) {
        this.pd = pd;
    }

    public List<Procedimientodental> getPro() {
        return Pro;
    }

    public void setPro(List<Procedimientodental> Pro) {
        this.Pro = Pro;
    }
    
    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Registro exitoso") );
    }
}
