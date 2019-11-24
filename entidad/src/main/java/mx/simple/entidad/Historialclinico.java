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
@Table(name = "historialclinico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historialclinico.findAll", query = "SELECT h FROM Historialclinico h"),
    @NamedQuery(name = "Historialclinico.findByEnfermedades", query = "SELECT h FROM Historialclinico h WHERE h.enfermedades = :enfermedades"),
    @NamedQuery(name = "Historialclinico.findByAlergias", query = "SELECT h FROM Historialclinico h WHERE h.alergias = :alergias"),
    @NamedQuery(name = "Historialclinico.findByProcedimiento", query = "SELECT h FROM Historialclinico h WHERE h.procedimiento = :procedimiento"),
    @NamedQuery(name = "Historialclinico.findByPacienteIDPaciente", query = "SELECT h FROM Historialclinico h WHERE h.pacienteIDPaciente = :pacienteIDPaciente")})
public class Historialclinico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Enfermedades")
    private String enfermedades;
    @Basic(optional = false)
    @Column(name = "Alergias")
    private String alergias;
    @Basic(optional = false)
    @Column(name = "Procedimiento")
    private String procedimiento;
    @Id
    @Basic(optional = false)
    @Column(name = "paciente_IDPaciente")
    private Integer pacienteIDPaciente;
    @JoinColumn(name = "paciente_IDPaciente", referencedColumnName = "IDPaciente", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Paciente paciente;

    public Historialclinico() {
    }

    public Historialclinico(Integer pacienteIDPaciente) {
        this.pacienteIDPaciente = pacienteIDPaciente;
    }

    public Historialclinico(Integer pacienteIDPaciente, String enfermedades, String alergias, String procedimiento) {
        this.pacienteIDPaciente = pacienteIDPaciente;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.procedimiento = procedimiento;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Integer getPacienteIDPaciente() {
        return pacienteIDPaciente;
    }

    public void setPacienteIDPaciente(Integer pacienteIDPaciente) {
        this.pacienteIDPaciente = pacienteIDPaciente;
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
        hash += (pacienteIDPaciente != null ? pacienteIDPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historialclinico)) {
            return false;
        }
        Historialclinico other = (Historialclinico) object;
        if ((this.pacienteIDPaciente == null && other.pacienteIDPaciente != null) || (this.pacienteIDPaciente != null && !this.pacienteIDPaciente.equals(other.pacienteIDPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Historialclinico[ pacienteIDPaciente=" + pacienteIDPaciente + " ]";
    }
    
}
