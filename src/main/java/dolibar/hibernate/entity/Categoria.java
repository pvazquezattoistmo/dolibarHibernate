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
@Table(name = "categoriasetiquetas")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorias")
    private Integer idCategorias;

    @Column(name = "referencia_categorias")
    private String referenciaCategorias;

    @Column(name = "descripcion_categorias")
    private String descripcionCategorias;

    @Column(name = "tipo_categorias")
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
