/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.delegate;
import java.util.List;
import mx.simple.entidad.Instrumentodental;
import mx.simple.integracion.ServiceLocator;

/**
 *
 * @author Raquel
 */
public class InstrumentodentalDelegate{
    
    public void saveInstrumentodental(Instrumentodental instrumentodental){
        ServiceLocator.getInstanceInstrumentodentalDAO().save(instrumentodental);
    }
    
    public void eliminarInstrumentoDental(Instrumentodental instrumentodental){
        ServiceLocator.getInstanceInstrumentodentalDAO().delete(instrumentodental);
    }
    
    public List<Instrumentodental> Consultar(){
        List<Instrumentodental> Ins = ServiceLocator.getInstanceInstrumentodentalDAO().findAll();
        return Ins;
    }
    
    public Instrumentodental findInstrumento(String nombre){
        Instrumentodental instrumentoDental = new Instrumentodental();
        List <Instrumentodental> Ins = ServiceLocator.getInstanceInstrumentodentalDAO().findAll();
        for(Instrumentodental obj : Ins){
            if(obj.getProducto().equalsIgnoreCase(nombre)){
                instrumentoDental = obj;
            }
        }
        return instrumentoDental;
    }
    
    public void modificarInstrumentoDental(Instrumentodental instrumentoDental){
        ServiceLocator.getInstanceInstrumentodentalDAO().update(instrumentoDental);
    }
}
