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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisc
 */
@Entity
@Table(name = "pagogeneral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagogeneral.findAll", query = "SELECT p FROM Pagogeneral p"),
    @NamedQuery(name = "Pagogeneral.findByIDPaciente", query = "SELECT p FROM Pagogeneral p WHERE p.iDPaciente = :iDPaciente"),
    @NamedQuery(name = "Pagogeneral.findByPrecio", query = "SELECT p FROM Pagogeneral p WHERE p.precio = :precio"),
    @NamedQuery(name = "Pagogeneral.findByProcedimientoRealizado", query = "SELECT p FROM Pagogeneral p WHERE p.procedimientoRealizado = :procedimientoRealizado"),
    @NamedQuery(name = "Pagogeneral.findByCantidad", query = "SELECT p FROM Pagogeneral p WHERE p.cantidad = :cantidad")})
public class Pagogeneral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPaciente")
    private Integer iDPaciente;
    @Basic(optional = false)
    @Column(name = "Precio")
    private float precio;
    @Basic(optional = false)
    @Column(name = "ProcedimientoRealizado")
    private String procedimientoRealizado;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private float cantidad;
    @JoinColumn(name = "IDPaciente", referencedColumnName = "IDPaciente", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Paciente paciente;

    public Pagogeneral() {
    }

    public Pagogeneral(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Pagogeneral(Integer iDPaciente, float precio, String procedimientoRealizado, float cantidad) {
        this.iDPaciente = iDPaciente;
        this.precio = precio;
        this.procedimientoRealizado = procedimientoRealizado;
        this.cantidad = cantidad;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getProcedimientoRealizado() {
        return procedimientoRealizado;
    }

    public void setProcedimientoRealizado(String procedimientoRealizado) {
        this.procedimientoRealizado = procedimientoRealizado;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPaciente != null ? iDPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagogeneral)) {
            return false;
        }
        Pagogeneral other = (Pagogeneral) object;
        if ((this.iDPaciente == null && other.iDPaciente != null) || (this.iDPaciente != null && !this.iDPaciente.equals(other.iDPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Pagogeneral[ iDPaciente=" + iDPaciente + " ]";
    }
    
}
