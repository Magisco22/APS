/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.helper;
import java.io.Serializable;
import java.util.List;
import mx.simple.entidad.Procedimientodental;
import mx.simple.integracion.ServiceFacadeLocator;

/**
 *
 * @author Gabriel Rodriguez
 */
public class ProcedimientosDentalesHelper implements Serializable {
    Procedimientodental procedimientodental;
   
    public Procedimientodental Registro(Procedimientodental procedimientodental){
        ServiceFacadeLocator.getInstanceFacadeProcedimientodental().saveProcedimiento(procedimientodental);
        return null;
    }
    
    public Procedimientodental Eliminar(Procedimientodental pden){
        ServiceFacadeLocator.getInstanceFacadeProcedimientodental().eliminarProcedimientosDentales(pden);
        return null;
    }
    
    public List<Procedimientodental> Consulta(){
        List <Procedimientodental> pde = ServiceFacadeLocator.getInstanceFacadeProcedimientodental().Consultar();
        return pde;
    } 
}
