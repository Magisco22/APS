
package mx.simple.integracion;

import mx.simple.DAO.CitaDAO;
import mx.simple.DAO.HistorialclinicoDAO;
import mx.simple.DAO.InstrumentodentalDAO;
import mx.simple.DAO.PacienteDAO;
import mx.simple.DAO.PagogeneralDAO;
import mx.simple.DAO.PagoortodonciaDAO;
import mx.simple.DAO.ProcedimientosDentalesDAO;

public class ServiceLocator {
    
    private static CitaDAO citaDAO;
    private static HistorialclinicoDAO historialclinicoDAO;
    private static InstrumentodentalDAO instrumentodentalDAO;
    private static PacienteDAO pacienteDAO;
    private static PagogeneralDAO pagogeneralDAO;
    private static PagoortodonciaDAO pagoortodonciaDAO;
    private static ProcedimientosDentalesDAO procedimientosdentalesDAO;
    

    public static CitaDAO getInstanceCitaDAO(){
        if(citaDAO == null){
            citaDAO = new CitaDAO();
            return citaDAO;
        } else{
            return citaDAO;
        }
    }

    public static PacienteDAO getInstancePacienteDAO(){
        if(pacienteDAO == null){
            pacienteDAO = new PacienteDAO();
            return pacienteDAO;
        } else{
            return pacienteDAO;
        }
    }
    
    public static HistorialclinicoDAO getInstanceHistorialclinicoDAO(){
        if(historialclinicoDAO == null){
            historialclinicoDAO = new HistorialclinicoDAO();
            return historialclinicoDAO;
        } else{
            return historialclinicoDAO;
        }
    }
    
    public static InstrumentodentalDAO getInstanceInstrumentodentalDAO(){
        if(instrumentodentalDAO == null){
            instrumentodentalDAO = new InstrumentodentalDAO();
            return instrumentodentalDAO;
        } else{
            return instrumentodentalDAO;
        }
    }
    
    public static PagogeneralDAO getInstancePagogeneralDAO(){
        if(pagogeneralDAO == null){
            pagogeneralDAO = new PagogeneralDAO();
            return pagogeneralDAO;
        } else{
            return pagogeneralDAO;
        }
    }
    
      public static PagoortodonciaDAO getInstancePagoortodonciaDAO(){
        if(pagoortodonciaDAO == null){
            pagoortodonciaDAO = new PagoortodonciaDAO();
            return pagoortodonciaDAO;
        } else{
            return pagoortodonciaDAO;
        }
    }
      
    public static ProcedimientosDentalesDAO getInstanceProcedimientosDentalesDAO(){
        if(procedimientosdentalesDAO == null){
            pagoortodonciaDAO = new PagoortodonciaDAO();
            return procedimientosdentalesDAO;
        } else{
            return procedimientosdentalesDAO;
        }
    }
}

