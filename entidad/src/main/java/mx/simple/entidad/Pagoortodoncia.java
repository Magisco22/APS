/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisc
 */
@Entity
@Table(name = "pagoortodoncia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagoortodoncia.findAll", query = "SELECT p FROM Pagoortodoncia p"),
    @NamedQuery(name = "Pagoortodoncia.findByIDPaciente", query = "SELECT p FROM Pagoortodoncia p WHERE p.pagoortodonciaPK.iDPaciente = :iDPaciente"),
    @NamedQuery(name = "Pagoortodoncia.findByFechaUltimoAbono", query = "SELECT p FROM Pagoortodoncia p WHERE p.fechaUltimoAbono = :fechaUltimoAbono"),
    @NamedQuery(name = "Pagoortodoncia.findByAbonoDeOrtodoncia", query = "SELECT p FROM Pagoortodoncia p WHERE p.abonoDeOrtodoncia = :abonoDeOrtodoncia"),
    @NamedQuery(name = "Pagoortodoncia.findByPrecioDeTratamiento", query = "SELECT p FROM Pagoortodoncia p WHERE p.precioDeTratamiento = :precioDeTratamiento"),
    @NamedQuery(name = "Pagoortodoncia.findBySaldo", query = "SELECT p FROM Pagoortodoncia p WHERE p.saldo = :saldo"),
    @NamedQuery(name = "Pagoortodoncia.findByIDPagoOrtodoncia", query = "SELECT p FROM Pagoortodoncia p WHERE p.pagoortodonciaPK.iDPagoOrtodoncia = :iDPagoOrtodoncia")})
public class Pagoortodoncia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagoortodonciaPK pagoortodonciaPK;
    @Basic(optional = false)
    @Column(name = "FechaUltimoAbono")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoAbono;
    @Basic(optional = false)
    @Column(name = "AbonoDeOrtodoncia")
    private float abonoDeOrtodoncia;
    @Basic(optional = false)
    @Column(name = "PrecioDeTratamiento")
    private float precioDeTratamiento;
    @Basic(optional = false)
    @Column(name = "Saldo")
    private int saldo;
    @JoinColumn(name = "IDPaciente", referencedColumnName = "IDPaciente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paciente paciente;

    public Pagoortodoncia() {
    }

    public Pagoortodoncia(PagoortodonciaPK pagoortodonciaPK) {
        this.pagoortodonciaPK = pagoortodonciaPK;
    }

    public Pagoortodoncia(PagoortodonciaPK pagoortodonciaPK, Date fechaUltimoAbono, float abonoDeOrtodoncia, float precioDeTratamiento, int saldo) {
        this.pagoortodonciaPK = pagoortodonciaPK;
        this.fechaUltimoAbono = fechaUltimoAbono;
        this.abonoDeOrtodoncia = abonoDeOrtodoncia;
        this.precioDeTratamiento = precioDeTratamiento;
        this.saldo = saldo;
    }

    public Pagoortodoncia(int iDPaciente, String iDPagoOrtodoncia) {
        this.pagoortodonciaPK = new PagoortodonciaPK(iDPaciente, iDPagoOrtodoncia);
    }

    public PagoortodonciaPK getPagoortodonciaPK() {
        return pagoortodonciaPK;
    }

    public void setPagoortodonciaPK(PagoortodonciaPK pagoortodonciaPK) {
        this.pagoortodonciaPK = pagoortodonciaPK;
    }

    public Date getFechaUltimoAbono() {
        return fechaUltimoAbono;
    }

    public void setFechaUltimoAbono(Date fechaUltimoAbono) {
        this.fechaUltimoAbono = fechaUltimoAbono;
    }

    public float getAbonoDeOrtodoncia() {
        return abonoDeOrtodoncia;
    }

    public void setAbonoDeOrtodoncia(float abonoDeOrtodoncia) {
        this.abonoDeOrtodoncia = abonoDeOrtodoncia;
    }

    public float getPrecioDeTratamiento() {
        return precioDeTratamiento;
    }

    public void setPrecioDeTratamiento(float precioDeTratamiento) {
        this.precioDeTratamiento = precioDeTratamiento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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
        hash += (pagoortodonciaPK != null ? pagoortodonciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagoortodoncia)) {
            return false;
        }
        Pagoortodoncia other = (Pagoortodoncia) object;
        if ((this.pagoortodonciaPK == null && other.pagoortodonciaPK != null) || (this.pagoortodonciaPK != null && !this.pagoortodonciaPK.equals(other.pagoortodonciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Pagoortodoncia[ pagoortodonciaPK=" + pagoortodonciaPK + " ]";
    }
    
}
