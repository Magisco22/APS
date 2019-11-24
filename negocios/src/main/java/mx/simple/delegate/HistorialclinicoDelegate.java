/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.delegate;

import mx.simple.entidad.Historialclinico;
import mx.simple.integracion.ServiceFacadeLocator;
/**
 *
 * @author Raquel
 */
public class HistorialclinicoDelegate {
    public void saveHistorialclinico(Historialclinico historialclinico){
        ServiceFacadeLocator.getInstanceFacadeHistorialclinico().guardarHistorialclinico(historialclinico);
    }
}
