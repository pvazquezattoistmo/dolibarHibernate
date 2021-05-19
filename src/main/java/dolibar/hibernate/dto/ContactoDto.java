/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.dto;

import java.util.Date;

/**
 *
 * @author PC
 */
public class ContactoDto {

    private Integer idContactos;
    private String nombreContactos;
    private String apellidoContactos;
    private String tituloContactos;
    private String puestoTrabajocontactos;
    private String direccionContactos;
    private String codigoPostalcontactos;
    private String ciudadContactos;
    private String paisContactos;
    private String estadoContactos;
    private String telTrabajocontactos;
    private String celularContactos;
    private String emailContactos;
    private boolean correoMasivocontactos;
    private Date fechanacimientoContactos;
    private CategoriaDto etiquetaContactos;
    private TerceroDto idTercero;

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

    public CategoriaDto getEtiquetaContactos() {
        return etiquetaContactos;
    }

    public void setEtiquetaContactos(CategoriaDto etiquetaContactos) {
        this.etiquetaContactos = etiquetaContactos;
    }

    public TerceroDto getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(TerceroDto idTercero) {
        this.idTercero = idTercero;
    }

}
