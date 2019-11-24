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
@Table(name = "instrumentodental")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instrumentodental.findAll", query = "SELECT i FROM Instrumentodental i"),
    @NamedQuery(name = "Instrumentodental.findByIDInstrumento", query = "SELECT i FROM Instrumentodental i WHERE i.iDInstrumento = :iDInstrumento"),
    @NamedQuery(name = "Instrumentodental.findByProducto", query = "SELECT i FROM Instrumentodental i WHERE i.producto = :producto"),
    @NamedQuery(name = "Instrumentodental.findByCantidad", query = "SELECT i FROM Instrumentodental i WHERE i.cantidad = :cantidad"),
    @NamedQuery(name = "Instrumentodental.findByDescripcion", query = "SELECT i FROM Instrumentodental i WHERE i.descripcion = :descripcion"),
    @NamedQuery(name = "Instrumentodental.findByTipo", query = "SELECT i FROM Instrumentodental i WHERE i.tipo = :tipo")})
public class Instrumentodental implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDInstrumento")
    private Integer iDInstrumento;
    @Basic(optional = false)
    @Column(name = "Producto")
    private String producto;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private String tipo;

    public Instrumentodental() {
    }

    public Instrumentodental(Integer iDInstrumento) {
        this.iDInstrumento = iDInstrumento;
    }

    public Instrumentodental(Integer iDInstrumento, String producto, int cantidad, String descripcion, String tipo) {
        this.iDInstrumento = iDInstrumento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Integer getIDInstrumento() {
        return iDInstrumento;
    }

    public void setIDInstrumento(Integer iDInstrumento) {
        this.iDInstrumento = iDInstrumento;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDInstrumento != null ? iDInstrumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instrumentodental)) {
            return false;
        }
        Instrumentodental other = (Instrumentodental) object;
        if ((this.iDInstrumento == null && other.iDInstrumento != null) || (this.iDInstrumento != null && !this.iDInstrumento.equals(other.iDInstrumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Instrumentodental[ iDInstrumento=" + iDInstrumento + " ]";
    }
    
}
