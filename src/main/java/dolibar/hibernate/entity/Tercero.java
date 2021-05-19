/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "terceros")
public class Tercero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_terceros")
    private Integer idTerceros;

    @Column(name = "nombre_terceros")
    private String nombreTerceros;

    @Column(name = "tipo_terceros")
    private String tipoTerceros;

    @Column(name = "direccion_terceros")
    private String direccionTerceros;

    @Column(name = "codigopostal_terceros")
    private String codigopostalTerceros;

    @Column(name = "pais_terceros")
    private String paisTerceros;

    @Column(name = "provincia_terceros")
    private String provinciaTerceros;

    @Column(name = "rfc_terceros")
    private String rfcTerceros;

    @Column(name = "rpimss_terceros")
    private String rpimssTerceros;

    @Column(name = "impuesto_terceros")
    private String impuestoTerceros;

    @Column(name = "formaJuridica_terceros")
    private String formaJuridicaterceros;

    @Column(name = "incoterms_terceros")
    private String incotermsTerceros;

    public Integer getIdTerceros() {
        return idTerceros;
    }

    public void setIdTerceros(Integer idTerceros) {
        this.idTerceros = idTerceros;
    }

    public String getNombreTerceros() {
        return nombreTerceros;
    }

    public void setNombreTerceros(String nombreTerceros) {
        this.nombreTerceros = nombreTerceros;
    }

    public String getTipoTerceros() {
        return tipoTerceros;
    }

    public void setTipoTerceros(String tipoTerceros) {
        this.tipoTerceros = tipoTerceros;
    }

    public String getDireccionTerceros() {
        return direccionTerceros;
    }

    public void setDireccionTerceros(String direccionTerceros) {
        this.direccionTerceros = direccionTerceros;
    }

    public String getCodigopostalTerceros() {
        return codigopostalTerceros;
    }

    public void setCodigopostalTerceros(String codigopostalTerceros) {
        this.codigopostalTerceros = codigopostalTerceros;
    }

    public String getPaisTerceros() {
        return paisTerceros;
    }

    public void setPaisTerceros(String paisTerceros) {
        this.paisTerceros = paisTerceros;
    }

    public String getProvinciaTerceros() {
        return provinciaTerceros;
    }

    public void setProvinciaTerceros(String provinciaTerceros) {
        this.provinciaTerceros = provinciaTerceros;
    }

    public String getRfcTerceros() {
        return rfcTerceros;
    }

    public void setRfcTerceros(String rfcTerceros) {
        this.rfcTerceros = rfcTerceros;
    }

    public String getRpimssTerceros() {
        return rpimssTerceros;
    }

    public void setRpimssTerceros(String rpimssTerceros) {
        this.rpimssTerceros = rpimssTerceros;
    }

    public String getImpuestoTerceros() {
        return impuestoTerceros;
    }

    public void setImpuestoTerceros(String impuestoTerceros) {
        this.impuestoTerceros = impuestoTerceros;
    }

    public String getFormaJuridicaterceros() {
        return formaJuridicaterceros;
    }

    public void setFormaJuridicaterceros(String formaJuridicaterceros) {
        this.formaJuridicaterceros = formaJuridicaterceros;
    }

    public String getIncotermsTerceros() {
        return incotermsTerceros;
    }

    public void setIncotermsTerceros(String incotermsTerceros) {
        this.incotermsTerceros = incotermsTerceros;
    }

}
