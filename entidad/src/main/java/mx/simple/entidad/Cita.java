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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisc
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIDPaciente", query = "SELECT c FROM Cita c WHERE c.iDPaciente = :iDPaciente"),
    @NamedQuery(name = "Cita.findByFechaDeCita", query = "SELECT c FROM Cita c WHERE c.fechaDeCita = :fechaDeCita"),
    @NamedQuery(name = "Cita.findByPrecio", query = "SELECT c FROM Cita c WHERE c.precio = :precio"),
    @NamedQuery(name = "Cita.findByHora", query = "SELECT c FROM Cita c WHERE c.hora = :hora"),
    @NamedQuery(name = "Cita.findByTipoDeProcedimiento", query = "SELECT c FROM Cita c WHERE c.tipoDeProcedimiento = :tipoDeProcedimiento")})
public class Cita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPaciente")
    private Integer iDPaciente;
    @Column(name = "FechaDeCita")
    @Temporal(TemporalType.DATE)
    private Date fechaDeCita;
    @Basic(optional = false)
    @Column(name = "Precio")
    private float precio;
    @Basic(optional = false)
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @Column(name = "TipoDeProcedimiento")
    private String tipoDeProcedimiento;
    @JoinColumn(name = "IDPaciente", referencedColumnName = "IDPaciente", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Paciente paciente;

    public Cita() {
    }

    public Cita(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Cita(Integer iDPaciente, float precio, Date hora, String tipoDeProcedimiento) {
        this.iDPaciente = iDPaciente;
        this.precio = precio;
        this.hora = hora;
        this.tipoDeProcedimiento = tipoDeProcedimiento;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Date getFechaDeCita() {
        return fechaDeCita;
    }

    public void setFechaDeCita(Date fechaDeCita) {
        this.fechaDeCita = fechaDeCita;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getTipoDeProcedimiento() {
        return tipoDeProcedimiento;
    }

    public void setTipoDeProcedimiento(String tipoDeProcedimiento) {
        this.tipoDeProcedimiento = tipoDeProcedimiento;
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
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.iDPaciente == null && other.iDPaciente != null) || (this.iDPaciente != null && !this.iDPaciente.equals(other.iDPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Cita[ iDPaciente=" + iDPaciente + " ]";
    }
    
}
