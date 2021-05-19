/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_terceros")
    private Integer idCliente;

    @Column(name = "codigo_clientes")
    private String codigoClientes;

    @OneToOne
    @JoinColumn(name = "idCategorias", referencedColumnName = "id_categorias")
    private Categoria etiquetaClientes;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigoClientes() {
        return codigoClientes;
    }

    public void setCodigoClientes(String codigoClientes) {
        this.codigoClientes = codigoClientes;
    }

    public Categoria getEtiquetaClientes() {
        return etiquetaClientes;
    }

    public void setEtiquetaClientes(Categoria etiquetaClientes) {
        this.etiquetaClientes = etiquetaClientes;
    }

}
