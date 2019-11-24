/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import mx.simple.delegate.CitaDelegate;
import mx.simple.entidad.Cita;

/**
 *
 * @author Raquel
 */
public class CitaFacade {
    private final CitaDelegate citaDelegate;

    public CitaFacade() {
        this.citaDelegate = new CitaDelegate();
    }
    
    public void guardarCita(Cita cita){
        citaDelegate.saveCita(cita);
    }
}
