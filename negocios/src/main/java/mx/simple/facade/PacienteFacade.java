/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import java.util.List;
import mx.simple.delegate.PacienteDelegate;
import mx.simple.entidad.Paciente;

/**
 *
 * @author Raquel
 */
public class PacienteFacade {
private final PacienteDelegate pacienteDelegate;

    public PacienteFacade() {
        this.pacienteDelegate = new PacienteDelegate();
    }
    
    public void savePaciente(Paciente paciente){
        pacienteDelegate.savePaciente(paciente);
    }
    
    public void eliminarPaciente(Paciente paciente){
        pacienteDelegate.eliminarPaciente(paciente);
    }
    
    public void modificarPaciente(Paciente paciente){
        pacienteDelegate.modificarPaciente(paciente);
    }
    
    public List<Paciente> Consultar(){
       List<Paciente> pa= pacienteDelegate.Consultar();
       return pa;
    }
}
