/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisc
 */
@Entity
@Table(name = "procedimientodental")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimientodental.findAll", query = "SELECT p FROM Procedimientodental p"),
    @NamedQuery(name = "Procedimientodental.findByIDProcedimiento", query = "SELECT p FROM Procedimientodental p WHERE p.iDProcedimiento = :iDProcedimiento"),
    @NamedQuery(name = "Procedimientodental.findByNombre", query = "SELECT p FROM Procedimientodental p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Procedimientodental.findByTipo", query = "SELECT p FROM Procedimientodental p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Procedimientodental.findByCosto", query = "SELECT p FROM Procedimientodental p WHERE p.costo = :costo"),
    @NamedQuery(name = "Procedimientodental.findByInstrumentosUtilizados", query = "SELECT p FROM Procedimientodental p WHERE p.instrumentosUtilizados = :instrumentosUtilizados")})
public class Procedimientodental implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDProcedimiento")
    private Integer iDProcedimiento;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "Costo")
    private float costo;
    @Basic(optional = false)
    @Column(name = "InstrumentosUtilizados")
    private String instrumentosUtilizados;

    public Procedimientodental() {
    }

    public Procedimientodental(Integer iDProcedimiento) {
        this.iDProcedimiento = iDProcedimiento;
    }

    public Procedimientodental(Integer iDProcedimiento, String nombre, String tipo, float costo, String instrumentosUtilizados) {
        this.iDProcedimiento = iDProcedimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.instrumentosUtilizados = instrumentosUtilizados;
    }

    public Integer getIDProcedimiento() {
        return iDProcedimiento;
    }

    public void setIDProcedimiento(Integer iDProcedimiento) {
        this.iDProcedimiento = iDProcedimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getInstrumentosUtilizados() {
        return instrumentosUtilizados;
    }

    public void setInstrumentosUtilizados(String instrumentosUtilizados) {
        this.instrumentosUtilizados = instrumentosUtilizados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProcedimiento != null ? iDProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedimientodental)) {
            return false;
        }
        Procedimientodental other = (Procedimientodental) object;
        if ((this.iDProcedimiento == null && other.iDProcedimiento != null) || (this.iDProcedimiento != null && !this.iDProcedimiento.equals(other.iDProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Procedimientodental[ iDProcedimiento=" + iDProcedimiento + " ]";
    }
    
}
