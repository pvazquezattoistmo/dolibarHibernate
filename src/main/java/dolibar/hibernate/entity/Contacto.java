/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "contactos")
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contactos")
    private Integer idContactos;

    @Column(name = "nombre_contactos")
    private String nombreContactos;

    @Column(name = "apellido_contactos")
    private String apellidoContactos;

    @Column(name = "titulo_contactos")
    private String tituloContactos;

    @Column(name = "puestoTrabajo_contactos")
    private String puestoTrabajocontactos;

    @Column(name = "direccion_contactos")
    private String direccionContactos;

    @Column(name = "codigoPostal_contactos")
    private String codigoPostalcontactos;

    @Column(name = "ciudad_contactos")
    private String ciudadContactos;

    @Column(name = "pais_contactos")
    private String paisContactos;

    @Column(name = "estado_contactos")
    private String estadoContactos;

    @Column(name = "telTrabajo_contactos")
    private String telTrabajocontactos;

    @Column(name = "celular_contactos")
    private String celularContactos;

    @Column(name = "email_contactos")
    private String emailContactos;

    @Column(name = "correoMasivo_contactos")
    private boolean correoMasivocontactos;

    @Column(name = "fechanacimiento_contactos")
    @Temporal(TemporalType.DATE)
    private Date fechanacimientoContactos;

    @Column(name = "id_categorias")
    private Categoria etiquetaContactos;

    @Column(name = "id_terceros")
    private Tercero idTercero;

    public Integer getIdContactos() {
        return idContactos;
    }

    public void setIdContactos(Integer idContactos) {
        this.idContactos = idContactos;
    }

    public String getNombreContactos() {
        return nombreContactos;
    }

    public void setNombreContactos(String nombreContactos) {
        this.nombreContactos = nombreContactos;
    }

    public String getApellidoContactos() {
        return apellidoContactos;
    }

    public void setApellidoContactos(String apellidoContactos) {
        this.apellidoContactos = apellidoContactos;
    }

    public String getTituloContactos() {
        return tituloContactos;
    }

    public void setTituloContactos(String tituloContactos) {
        this.tituloContactos = tituloContactos;
    }

    public String getPuestoTrabajocontactos() {
        return puestoTrabajocontactos;
    }

    public void setPuestoTrabajocontactos(String puestoTrabajocontactos) {
        this.puestoTrabajocontactos = puestoTrabajocontactos;
    }

    public String getDireccionContactos() {
        return direccionContactos;
    }

    public void setDireccionContactos(String direccionContactos) {
        this.direccionContactos = direccionContactos;
    }

    public String getCodigoPostalcontactos() {
        return codigoPostalcontactos;
    }

    public void setCodigoPostalcontactos(String codigoPostalcontactos) {
        this.codigoPostalcontactos = codigoPostalcontactos;
    }

    public String getCiudadContactos() {
        return ciudadContactos;
    }

    public void setCiudadContactos(String ciudadContactos) {
        this.ciudadContactos = ciudadContactos;
    }

    public String getPaisContactos() {
        return paisContactos;
    }

    public void setPaisContactos(String paisContactos) {
        this.paisContactos = paisContactos;
    }

    public String getEstadoContactos() {
        return estadoContactos;
    }

    public void setEstadoContactos(String estadoContactos) {
        this.estadoContactos = estadoContactos;
    }

    public String getTelTrabajocontactos() {
        return telTrabajocontactos;
    }

    public void setTelTrabajocontactos(String telTrabajocontactos) {
        this.telTrabajocontactos = telTrabajocontactos;
    }

    public String getCelularContactos() {
        return celularContactos;
    }

    public void setCelularContactos(String celularContactos) {
        this.celularContactos = celularContactos;
    }

    public String getEmailContactos() {
        return emailContactos;
    }

    public void setEmailContactos(String emailContactos) {
        this.emailContactos = emailContactos;
    }

    public boolean isCorreoMasivocontactos() {
        return correoMasivocontactos;
    }

    public void setCorreoMasivocontactos(boolean correoMasivocontactos) {
        this.correoMasivocontactos = correoMasivocontactos;
    }

    public Date getFechanacimientoContactos() {
        return fechanacimientoContactos;
    }

    public void setFechanacimientoContactos(Date fechanacimientoContactos) {
        this.fechanacimientoContactos = fechanacimientoContactos;
    }

    public Categoria getEtiquetaContactos() {
        return etiquetaContactos;
    }

    public void setEtiquetaContactos(Categoria etiquetaContactos) {
        this.etiquetaContactos = etiquetaContactos;
    }

    public Tercero getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Tercero idTercero) {
        this.idTercero = idTercero;
    }

}
