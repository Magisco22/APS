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
public class PagoortodonciaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDPaciente")
    private int iDPaciente;
    @Basic(optional = false)
    @Column(name = "IDPagoOrtodoncia")
    private String iDPagoOrtodoncia;

    public PagoortodonciaPK() {
    }

    public PagoortodonciaPK(int iDPaciente, String iDPagoOrtodoncia) {
        this.iDPaciente = iDPaciente;
        this.iDPagoOrtodoncia = iDPagoOrtodoncia;
    }

    public int getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(int iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public String getIDPagoOrtodoncia() {
        return iDPagoOrtodoncia;
    }

    public void setIDPagoOrtodoncia(String iDPagoOrtodoncia) {
        this.iDPagoOrtodoncia = iDPagoOrtodoncia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iDPaciente;
        hash += (iDPagoOrtodoncia != null ? iDPagoOrtodoncia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoortodonciaPK)) {
            return false;
        }
        PagoortodonciaPK other = (PagoortodonciaPK) object;
        if (this.iDPaciente != other.iDPaciente) {
            return false;
        }
        if ((this.iDPagoOrtodoncia == null && other.iDPagoOrtodoncia != null) || (this.iDPagoOrtodoncia != null && !this.iDPagoOrtodoncia.equals(other.iDPagoOrtodoncia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.PagoortodonciaPK[ iDPaciente=" + iDPaciente + ", iDPagoOrtodoncia=" + iDPagoOrtodoncia + " ]";
    }
    
}
