/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.dto;

/**
 *
 * @author PC
 */
public class CategoriaDto {

    private Integer idCategorias;
    private String referenciaCategorias;
    private String descripcionCategorias;
    private String tipoCategorias;

    public Integer getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(Integer idCategorias) {
        this.idCategorias = idCategorias;
    }

    public String getReferenciaCategorias() {
        return referenciaCategorias;
    }

    public void setReferenciaCategorias(String referenciaCategorias) {
        this.referenciaCategorias = referenciaCategorias;
    }

    public String getDescripcionCategorias() {
        return descripcionCategorias;
    }

    public void setDescripcionCategorias(String descripcionCategorias) {
        this.descripcionCategorias = descripcionCategorias;
    }

    public String getTipoCategorias() {
        return tipoCategorias;
    }

    public void setTipoCategorias(String tipoCategorias) {
        this.tipoCategorias = tipoCategorias;
    }

}
