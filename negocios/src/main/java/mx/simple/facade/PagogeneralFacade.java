/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import mx.simple.delegate.CitaDelegate;
import mx.simple.delegate.PagogeneralDelegate;
import mx.simple.entidad.Cita;
import mx.simple.entidad.Pagogeneral;

/**
 *
 * @author Raquel
 */
public class PagogeneralFacade {
    private final PagogeneralDelegate pagogeneraldelegate;

    public PagogeneralFacade() {
        this.pagogeneraldelegate = new PagogeneralDelegate();
    }
    
    public void guardarPagogeneral(Pagogeneral pagogeneral){
        pagogeneraldelegate.savePagogeneral(pagogeneral);
    }
}
