package mx.simple.delegate;
import java.util.List;
import mx.simple.entidad.Procedimientodental;
import mx.simple.integracion.ServiceLocator;

/**
 *
 * @author Gabriel Rodriguez
 */
public class ProcedimientosDentalesDelegate {
 
    
    public void eliminarProcedimientoDental(Procedimientodental PD){
        ServiceLocator.getInstanceProcedimientosDentalesDAO().delete(PD);
    }
    
    public void saveProcedimiento(Procedimientodental procedimientodental){
        ServiceLocator.getInstanceProcedimientosDentalesDAO().save(procedimientodental);
    }
    
    public List <Procedimientodental> Consultar(){
        List <Procedimientodental> pa = ServiceLocator.getInstanceProcedimientosDentalesDAO().findAll();
        return pa;
    }
    
    public Procedimientodental findNombre(String procedimiento){
        Procedimientodental pd = new Procedimientodental();
        List<Procedimientodental> pa = ServiceLocator.getInstanceProcedimientosDentalesDAO().findAll();
        for(Procedimientodental obj : pa){
            if(obj.getNombre().equals(procedimiento)){
                pd = obj;
            }
        }
        return pd;
    }
}
