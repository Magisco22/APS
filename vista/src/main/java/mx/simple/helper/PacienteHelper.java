/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.helper;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import mx.simple.delegate.PacienteDelegate;
import mx.simple.entidad.Paciente;
import mx.simple.integracion.ServiceFacadeLocator;

/**
 *
 * @author luisc
 */

public class PacienteHelper implements Serializable{
    
   Paciente paciente;
    
   //metodo para Registrar Paciente con un parametro de tipo paciente
    public Paciente Registro(Paciente paciente){
       ServiceFacadeLocator.getInstanceFacadePaciente().savePaciente(paciente);
       return null;
        
    }
    
    public Paciente modificar(Paciente paciente){
        ServiceFacadeLocator.getInstanceFacadePaciente().modificarPaciente(paciente);
        return null;
    }
    //Metodo para eliminar un paciente en especifico con un parametro tipo paciente
    public Paciente eliminar(Paciente paciente){
        ServiceFacadeLocator.getInstanceFacadePaciente().eliminarPaciente(paciente);
        return null;
    }
    
    //Metodo para Consulta general de pacientes, se regresa una lista de tipo paciente
    public List<Paciente> Consulta(){
        List<Paciente> pa= ServiceFacadeLocator.getInstanceFacadePaciente().Consultar();
       return pa;
        
    }
    
}