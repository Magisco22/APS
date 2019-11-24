/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import mx.simple.delegate.CitaDelegate;
import mx.simple.delegate.PagoortodonciaDelegate;
import mx.simple.entidad.Cita;
import mx.simple.entidad.Pagoortodoncia;

/**
 *
 * @author Raquel
 */
public class PagoortodonciaFacade {
    private final PagoortodonciaDelegate pagoortodonciadelegate;

    public PagoortodonciaFacade() {
        this.pagoortodonciadelegate = new PagoortodonciaDelegate();
    }
    
    public void guardarPagoortodoncia(Pagoortodoncia pagoortodoncia){
        pagoortodonciadelegate.savePagoortodoncia(pagoortodoncia);
    }
}
