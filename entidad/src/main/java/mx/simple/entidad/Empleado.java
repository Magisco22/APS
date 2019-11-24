/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisc
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIDEmpleado", query = "SELECT e FROM Empleado e WHERE e.empleadoPK.iDEmpleado = :iDEmpleado"),
    @NamedQuery(name = "Empleado.findByTipo", query = "SELECT e FROM Empleado e WHERE e.tipo = :tipo"),
    @NamedQuery(name = "Empleado.findByPuesto", query = "SELECT e FROM Empleado e WHERE e.puesto = :puesto"),
    @NamedQuery(name = "Empleado.findByUsuarioIDUsuario", query = "SELECT e FROM Empleado e WHERE e.empleadoPK.usuarioIDUsuario = :usuarioIDUsuario")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpleadoPK empleadoPK;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "Puesto")
    private String puesto;
    @JoinColumn(name = "usuario_IDUsuario", referencedColumnName = "IDUsuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Empleado() {
    }

    public Empleado(EmpleadoPK empleadoPK) {
        this.empleadoPK = empleadoPK;
    }

    public Empleado(EmpleadoPK empleadoPK, String tipo, String puesto) {
        this.empleadoPK = empleadoPK;
        this.tipo = tipo;
        this.puesto = puesto;
    }

    public Empleado(int iDEmpleado, int usuarioIDUsuario) {
        this.empleadoPK = new EmpleadoPK(iDEmpleado, usuarioIDUsuario);
    }

    public EmpleadoPK getEmpleadoPK() {
        return empleadoPK;
    }

    public void setEmpleadoPK(EmpleadoPK empleadoPK) {
        this.empleadoPK = empleadoPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empleadoPK != null ? empleadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.empleadoPK == null && other.empleadoPK != null) || (this.empleadoPK != null && !this.empleadoPK.equals(other.empleadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Empleado[ empleadoPK=" + empleadoPK + " ]";
    }
    
}
