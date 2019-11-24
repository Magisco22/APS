
import java.util.ArrayList;
import java.util.List;
import mx.simple.DAO.PacienteDAO;
import mx.simple.entidad.Paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raquel
 */
public class test {
    public static void main(String args[]){
        List<Paciente> listaPacientes = new ArrayList();
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        
        listaPacientes = pacienteDAO.findAll();
        
        for ( Paciente p:listaPacientes){
            System.out.println(p.getIDPaciente() + " " + p.getNombre());
        }
    }
}
