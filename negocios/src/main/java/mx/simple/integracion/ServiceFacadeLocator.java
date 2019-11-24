/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.integracion;

import mx.simple.facade.CitaFacade;
import mx.simple.facade.HistorialclinicoFacade;
import mx.simple.facade.InstrumentodentalFacade;
import mx.simple.facade.PacienteFacade;
import mx.simple.facade.PagogeneralFacade;
import mx.simple.facade.PagoortodonciaFacade;
import mx.simple.facade.ProcedimientosDentalesFacade;



public class ServiceFacadeLocator {
    private static PacienteFacade pacienteFacade;
    private static CitaFacade citaFacade;
    private static HistorialclinicoFacade historialclinicoFacade;
    private static InstrumentodentalFacade instrumentodentalFacade;
    private static PagogeneralFacade pagogeneralFacade;
    private static PagoortodonciaFacade pagoortodonciaFacade;
    private static ProcedimientosDentalesFacade procedimientosdentalesFacade;
    
    public static PacienteFacade getInstanceFacadePaciente() {
           if (pacienteFacade == null) {
               pacienteFacade = new PacienteFacade();
               return pacienteFacade;
           } else {
               return pacienteFacade;
           }
    }
    
    
    public static ProcedimientosDentalesFacade getInstanceFacadeProcedimientodental() {
           if (procedimientosdentalesFacade == null) {
               procedimientosdentalesFacade = new ProcedimientosDentalesFacade();
               return procedimientosdentalesFacade;
           } else {
               return procedimientosdentalesFacade;
           }
    }

    
    
    
    public static CitaFacade getInstanceFacadeCita() {
           if (citaFacade == null) {
               citaFacade = new CitaFacade();
               return citaFacade;
           } else {
               return citaFacade;
           }
    }
    
    public static HistorialclinicoFacade getInstanceFacadeHistorialclinico() {
           if (historialclinicoFacade == null) {
               historialclinicoFacade = new HistorialclinicoFacade();
               return historialclinicoFacade;
           } else {
               return historialclinicoFacade;
           }
    }
    
    public static InstrumentodentalFacade getInstanceFacadeInstrumentodental() {
           if (instrumentodentalFacade == null) {
               instrumentodentalFacade = new InstrumentodentalFacade();
               return instrumentodentalFacade;
           } else {
               return instrumentodentalFacade;
           }
    }
    
    
    public static PagogeneralFacade getInstanceFacadePagogeneral() {
           if (pagogeneralFacade == null) {
               pagogeneralFacade = new PagogeneralFacade();
               return pagogeneralFacade;
           } else {
               return pagogeneralFacade;
           }
    }
    
    public static PagoortodonciaFacade getInstanceFacadePagoortodoncia() {
           if (pagoortodonciaFacade == null) {
               pagoortodonciaFacade = new PagoortodonciaFacade();
               return pagoortodonciaFacade;
           } else {
               return pagoortodonciaFacade;
           }
    }
    
    
}
