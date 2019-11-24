/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import mx.simple.delegate.CitaDelegate;
import mx.simple.delegate.HistorialclinicoDelegate;
import mx.simple.entidad.Cita;
import mx.simple.entidad.Historialclinico;

/**
 *
 * @author Raquel
 */
public class HistorialclinicoFacade {
    private final HistorialclinicoDelegate historialclinicoDelegate;

    public HistorialclinicoFacade() {
        this.historialclinicoDelegate = new HistorialclinicoDelegate();
    }
    
    public void guardarHistorialclinico(Historialclinico historialclinico){
        historialclinicoDelegate.saveHistorialclinico(historialclinico);
    }
}
