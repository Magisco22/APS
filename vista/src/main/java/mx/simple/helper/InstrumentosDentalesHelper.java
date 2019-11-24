package mx.simple.helper;
import java.io.Serializable;
import java.util.List;
import mx.simple.entidad.Instrumentodental;
import mx.simple.integracion.ServiceFacadeLocator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Rodriguez
 */
public class InstrumentosDentalesHelper implements Serializable {
    Instrumentodental instrumentoDental;
    
    public Instrumentodental Registro(Instrumentodental instrumentoDental){
        ServiceFacadeLocator.getInstanceFacadeInstrumentodental().guardarInstrumentodental(instrumentoDental);
        return null;
    }
    public Instrumentodental Modificar(Instrumentodental instrumentoDental){
        ServiceFacadeLocator.getInstanceFacadeInstrumentodental().modificarInstrumentodental(instrumentoDental);
        return null;
    }
    
    public Instrumentodental Eliminar(Instrumentodental instrumentoDental){
        ServiceFacadeLocator.getInstanceFacadeInstrumentodental().eliminarInstrumentodental(instrumentoDental);
        return null;
    }
    
    public List<Instrumentodental> Consulta(){
        List<Instrumentodental> Ins = ServiceFacadeLocator.getInstanceFacadeInstrumentodental().Consultar();
        return Ins;
    }
    
}
