package mx.simple.facade;

import java.util.List;
import mx.simple.delegate.ProcedimientosDentalesDelegate;
import mx.simple.entidad.Procedimientodental;

/**
 *
 * @author Gabriel Rodriguez
 */
public class ProcedimientosDentalesFacade {
private final ProcedimientosDentalesDelegate procedimientosDentalesDelegate;

    public ProcedimientosDentalesFacade() {
        this.procedimientosDentalesDelegate = new ProcedimientosDentalesDelegate();
    }
    
  public void saveProcedimiento(Procedimientodental procedimientodental){
      procedimientosDentalesDelegate.saveProcedimiento(procedimientodental);
  }
    
    public void eliminarProcedimientosDentales(Procedimientodental procedimientoDental){
        procedimientosDentalesDelegate.eliminarProcedimientoDental(procedimientoDental);
    }
    
    public List<Procedimientodental> Consultar(){
       List<Procedimientodental> pa= procedimientosDentalesDelegate.Consultar();
       return pa;
    }
}

