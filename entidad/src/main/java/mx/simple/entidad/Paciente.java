/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luisc
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByIDPaciente", query = "SELECT p FROM Paciente p WHERE p.iDPaciente = :iDPaciente"),
    @NamedQuery(name = "Paciente.findByNombre", query = "SELECT p FROM Paciente p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Paciente.findByFechaDeRegistro", query = "SELECT p FROM Paciente p WHERE p.fechaDeRegistro = :fechaDeRegistro"),
    @NamedQuery(name = "Paciente.findByFechaDeNacimiento", query = "SELECT p FROM Paciente p WHERE p.fechaDeNacimiento = :fechaDeNacimiento"),
    @NamedQuery(name = "Paciente.findByTelefono", query = "SELECT p FROM Paciente p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Paciente.findByTelefono2", query = "SELECT p FROM Paciente p WHERE p.telefono2 = :telefono2"),
    @NamedQuery(name = "Paciente.findByCorreo", query = "SELECT p FROM Paciente p WHERE p.correo = :correo"),
    @NamedQuery(name = "Paciente.findByDomicilio", query = "SELECT p FROM Paciente p WHERE p.domicilio = :domicilio"),
    @NamedQuery(name = "Paciente.findByAseguranza", query = "SELECT p FROM Paciente p WHERE p.aseguranza = :aseguranza"),
    @NamedQuery(name = "Paciente.findByNumeroDeSeguro", query = "SELECT p FROM Paciente p WHERE p.numeroDeSeguro = :numeroDeSeguro"),
    @NamedQuery(name = "Paciente.findByTipo", query = "SELECT p FROM Paciente p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Paciente.findByApellidoP", query = "SELECT p FROM Paciente p WHERE p.apellidoP = :apellidoP"),
    @NamedQuery(name = "Paciente.findByApellidoM", query = "SELECT p FROM Paciente p WHERE p.apellidoM = :apellidoM"),
    @NamedQuery(name = "Paciente.findByGenero", query = "SELECT p FROM Paciente p WHERE p.genero = :genero")})
public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPaciente")
    private Integer iDPaciente;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "FechaDeRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaDeRegistro;
    @Basic(optional = false)
    @Column(name = "FechaDeNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaDeNacimiento;
    @Basic(optional = false)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "Telefono2")
    private String telefono2;
    @Basic(optional = false)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "Domicilio")
    private String domicilio;
    @Column(name = "Aseguranza")
    private Boolean aseguranza;
    @Basic(optional = false)
    @Column(name = "NumeroDeSeguro")
    private int numeroDeSeguro;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "ApellidoP")
    private String apellidoP;
    @Basic(optional = false)
    @Column(name = "ApellidoM")
    private String apellidoM;
    @Basic(optional = false)
    @Column(name = "Genero")
    private String genero;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Historialclinico historialclinico;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Pagogeneral pagogeneral;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Cita cita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private List<Pagoortodoncia> pagoortodonciaList;

    public Paciente() {
    }

    public Paciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Paciente(Integer iDPaciente, String nombre, Date fechaDeRegistro, Date fechaDeNacimiento, String telefono, String telefono2, String correo, String domicilio, int numeroDeSeguro, String tipo, String apellidoP, String apellidoM, String genero) {
        this.iDPaciente = iDPaciente;
        this.nombre = nombre;
        this.fechaDeRegistro = fechaDeRegistro;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.telefono2 = telefono2;
        this.correo = correo;
        this.domicilio = domicilio;
        this.numeroDeSeguro = numeroDeSeguro;
        this.tipo = tipo;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.genero = genero;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Boolean getAseguranza() {
        return aseguranza;
    }

    public void setAseguranza(Boolean aseguranza) {
        this.aseguranza = aseguranza;
    }

    public int getNumeroDeSeguro() {
        return numeroDeSeguro;
    }

    public void setNumeroDeSeguro(int numeroDeSeguro) {
        this.numeroDeSeguro = numeroDeSeguro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Historialclinico getHistorialclinico() {
        return historialclinico;
    }

    public void setHistorialclinico(Historialclinico historialclinico) {
        this.historialclinico = historialclinico;
    }

    public Pagogeneral getPagogeneral() {
        return pagogeneral;
    }

    public void setPagogeneral(Pagogeneral pagogeneral) {
        this.pagogeneral = pagogeneral;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @XmlTransient
    public List<Pagoortodoncia> getPagoortodonciaList() {
        return pagoortodonciaList;
    }

    public void setPagoortodonciaList(List<Pagoortodoncia> pagoortodonciaList) {
        this.pagoortodonciaList = pagoortodonciaList;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.iDPaciente == null && other.iDPaciente != null) || (this.iDPaciente != null && !this.iDPaciente.equals(other.iDPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Paciente[ iDPaciente=" + iDPaciente + " ]";
    }
    
}
