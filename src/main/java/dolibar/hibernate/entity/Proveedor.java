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
@Table(name = "proveedores")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedores")
    private Integer idProveedores;

    @Column(name = "codigo_proovedores")
    private String codigoProovedores;

    @Column(name = "codigoBarras_proveedores")
    private String codigoBarrasproveedores;

    @Column(name = "id_categorias")
    private Categoria categoriaProveedores;

    @Column(name = "id_terceros")
    private Tercero idTercero;

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

    public Categoria getCategoriaProveedores() {
        return categoriaProveedores;
    }

    public void setCategoriaProveedores(Categoria categoriaProveedores) {
        this.categoriaProveedores = categoriaProveedores;
    }

    public Tercero getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Tercero idTercero) {
        this.idTercero = idTercero;
    }

}
