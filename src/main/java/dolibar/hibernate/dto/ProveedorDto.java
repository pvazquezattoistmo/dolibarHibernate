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
public class ProveedorDto {

    private Integer idProveedores;
    private String codigoProovedores;
    private String codigoBarrasproveedores;
    private CategoriaDto categoriaProveedores;
    private TerceroDto idTercero;

    public Integer getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(Integer idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getCodigoProovedores() {
        return codigoProovedores;
    }

    public void setCodigoProovedores(String codigoProovedores) {
        this.codigoProovedores = codigoProovedores;
    }

    public String getCodigoBarrasproveedores() {
        return codigoBarrasproveedores;
    }

    public void setCodigoBarrasproveedores(String codigoBarrasproveedores) {
        this.codigoBarrasproveedores = codigoBarrasproveedores;
    }

    public CategoriaDto getCategoriaProveedores() {
        return categoriaProveedores;
    }

    public void setCategoriaProveedores(CategoriaDto categoriaProveedores) {
        this.categoriaProveedores = categoriaProveedores;
    }

    public TerceroDto getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(TerceroDto idTercero) {
        this.idTercero = idTercero;
    }

}
