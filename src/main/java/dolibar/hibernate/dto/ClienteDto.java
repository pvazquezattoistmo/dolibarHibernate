/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.dto;

import dolibar.hibernate.entity.Categoria;
import dolibar.hibernate.entity.Tercero;

/**
 *
 * @author PC
 */
public class ClienteDto {

    private Integer idClientes;
    private String codigoClientes;
    private Categoria etiquetaClientes;
    private Tercero idTercero;

    public Integer getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(Integer idClientes) {
        this.idClientes = idClientes;
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

    public Tercero getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Tercero idTercero) {
        this.idTercero = idTercero;
    }

}
