/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author luisc
 */
@Embeddable
public class EmpleadoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDEmpleado")
    private int iDEmpleado;
    @Basic(optional = false)
    @Column(name = "usuario_IDUsuario")
    private int usuarioIDUsuario;

    public EmpleadoPK() {
    }

    public EmpleadoPK(int iDEmpleado, int usuarioIDUsuario) {
        this.iDEmpleado = iDEmpleado;
        this.usuarioIDUsuario = usuarioIDUsuario;
    }

    public int getIDEmpleado() {
        return iDEmpleado;
    }

    public void setIDEmpleado(int iDEmpleado) {
        this.iDEmpleado = iDEmpleado;
    }

    public int getUsuarioIDUsuario() {
        return usuarioIDUsuario;
    }

    public void setUsuarioIDUsuario(int usuarioIDUsuario) {
        this.usuarioIDUsuario = usuarioIDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iDEmpleado;
        hash += (int) usuarioIDUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoPK)) {
            return false;
        }
        EmpleadoPK other = (EmpleadoPK) object;
        if (this.iDEmpleado != other.iDEmpleado) {
            return false;
        }
        if (this.usuarioIDUsuario != other.usuarioIDUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.EmpleadoPK[ iDEmpleado=" + iDEmpleado + ", usuarioIDUsuario=" + usuarioIDUsuario + " ]";
    }
    
}
