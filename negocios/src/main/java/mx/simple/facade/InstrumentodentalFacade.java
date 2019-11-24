/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;
import java.util.List;
import mx.simple.delegate.InstrumentodentalDelegate;
import mx.simple.entidad.Instrumentodental;

/**
 *
 * @author Raquel
 */
public class InstrumentodentalFacade {
    private final InstrumentodentalDelegate instrumentodentalDelegate;

    public InstrumentodentalFacade() {
        this.instrumentodentalDelegate = new InstrumentodentalDelegate();
    }
    
    public void guardarInstrumentodental(Instrumentodental instrumentodental){
        instrumentodentalDelegate.saveInstrumentodental(instrumentodental);
    }
    
    public void eliminarInstrumentodental(Instrumentodental instrumentodental){
        instrumentodentalDelegate.eliminarInstrumentoDental(instrumentodental);
    }
    
    public List<Instrumentodental> Consultar(){
        List<Instrumentodental> Ins = instrumentodentalDelegate.Consultar();
        return Ins;
    }
    
    public void modificarInstrumentodental(Instrumentodental instrumentoDental){
        instrumentodentalDelegate.modificarInstrumentoDental(instrumentoDental);
    }
    
}
