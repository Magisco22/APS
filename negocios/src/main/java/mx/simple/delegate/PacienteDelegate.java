/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.delegate;

import java.util.List;
import mx.simple.entidad.Paciente;
import mx.simple.integracion.ServiceFacadeLocator;
import mx.simple.integracion.ServiceLocator;

/**
 *
 * @author Raquel
 */
public class PacienteDelegate {
    public void savePaciente(Paciente paciente){
        ServiceLocator.getInstancePacienteDAO().save(paciente);
    }
    
    public void eliminarPaciente(Paciente paciente){
        ServiceLocator.getInstancePacienteDAO().delete(paciente);
    }
    
    public void modificarPaciente(Paciente paciente){
        ServiceLocator.getInstancePacienteDAO().update(paciente);
    }
    
    public List<Paciente> Consultar(){
       List<Paciente> pa= ServiceLocator.getInstancePacienteDAO().findAll();
      
   return pa;
       
    }
    public Paciente findNombre(String nombre){
        Paciente paciente = new Paciente();
        List<Paciente> pa = ServiceLocator.getInstancePacienteDAO().findAll();
        for(Paciente obj : pa){
            if(obj.getNombre().equals(nombre)){
                paciente = obj;
            }
        }
        return paciente;
    }
}
