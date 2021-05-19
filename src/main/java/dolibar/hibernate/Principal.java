/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate;

import dolibar.hibernate.dto.CategoriaDto;
import dolibar.hibernate.dto.TerceroDto;
import dolibar.hibernate.service.CategoriaService;
import dolibar.hibernate.service.TerceroService;

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        Principal pri = new Principal();
        //pri.probarTercero();
        pri.probarCategoria();
    }

    public void probarTercero() {
        System.out.println("=========================== TERCEROS ====================");
        TerceroService service = new TerceroService();

        System.out.println("=========================== CREAR TERCEROS ====================");

        /*
        TerceroDto terDto = new TerceroDto();
        terDto.setNombreTerceros("Nuevo");
        terDto.setTipoTerceros("Nuevo");
        terDto.setDireccionTerceros("Nuevo");
        terDto.setCodigopostalTerceros("Nuevo");
        terDto.setPaisTerceros("Nuevo");
        terDto.setProvinciaTerceros("Nuevo");
        terDto.setRfcTerceros("Nuevo");
        terDto.setImpuestoTerceros("Nuevo");
        terDto.setFormaJuridicaterceros("Nuevo");
        terDto.setIncotermsTerceros("Nuevo");
        terDto.setRpimssTerceros("Nuevo");
        
        service.crear(terDto);
         */
        System.out.println("=========================== BUSCANDO UN TERCERO ====================");
        TerceroDto terDtoById = new TerceroDto();
        terDtoById.setIdTerceros(12);
        System.out.println(service.buscarById(terDtoById));

        System.out.println("=========================== ACTUALIZANDO UN TERCERO ====================");
        TerceroDto terDtoUpdate = new TerceroDto();
        /*
        terDtoUpdate.setIdTerceros(12);
        terDtoUpdate.setNombreTerceros("Nuevo2");
        terDtoUpdate.setTipoTerceros("Nuevo2");
        terDtoUpdate.setDireccionTerceros("Nuevo2");
        terDtoUpdate.setCodigopostalTerceros("Nuevo2");
        terDtoUpdate.setPaisTerceros("Nuevo2");
        terDtoUpdate.setProvinciaTerceros("Nuevo2");
        terDtoUpdate.setRfcTerceros("Nuevo2");
        terDtoUpdate.setImpuestoTerceros("Nuevo2");
        terDtoUpdate.setFormaJuridicaterceros("Nuevo2");
        terDtoUpdate.setIncotermsTerceros("Nuevo2");
        terDtoUpdate.setRpimssTerceros("Nuevo2");
        service.actualizar(terDtoUpdate);
         */
        System.out.println("=========================== ELIMINANDO TERCEROS ====================");
        /*
        TerceroDto terDtoByDelete = new TerceroDto();
        terDtoByDelete.setIdTerceros(12);
        TerceroDto eliminarDto = service.buscarById(terDtoByDelete);
        System.out.println(eliminarDto);
        service.eliminar(eliminarDto);
         */
        System.out.println("=========================== LISTANDO TERCEROS ====================");
        service.listar().stream().forEach(x -> System.out.println(x.toString()));
    }

    public void probarCategoria() {
        System.out.println("=========================== ETIQUETAS CATEGORIAS ====================");
        CategoriaService service = new CategoriaService();

        System.out.println("=========================== CREANDO UNA ETIQUETA ====================");
        /*
        CategoriaDto etiqueta1 = new CategoriaDto();
        etiqueta1.setDescripcionCategorias("nuevo");
        etiqueta1.setReferenciaCategorias("nuevo");
        etiqueta1.setTipoCategorias("nuevo");
        catDao.insertar(etiqueta1);
         */
        System.out.println("=========================== BUSCANDO UNA ETIQUETA ====================");
        CategoriaDto etiquetaById = new CategoriaDto();
        etiquetaById.setIdCategorias(2);
        CategoriaDto encontrado = service.buscarById(etiquetaById);
        System.out.println(encontrado);

        System.out.println("=========================== ACTUALIZANDO UNA ETIQUETA ====================");
        CategoriaDto etiquetaActualizar = new CategoriaDto();
        etiquetaActualizar.setIdCategorias(8);
        etiquetaActualizar.setDescripcionCategorias("Actrualizatr2");
        etiquetaActualizar.setReferenciaCategorias("Actrualizatr2");
        etiquetaActualizar.setTipoCategorias("Actrualizatr2");
        service.actualizar(etiquetaActualizar);

        System.out.println("=========================== ELIMINANDO ETIQUETAS ====================");
        CategoriaDto etiquetaByDelete = new CategoriaDto();
        etiquetaByDelete.setIdCategorias(2);
        CategoriaDto categoriaEliminar = service.buscarById(etiquetaByDelete);
        service.eliminar(categoriaEliminar);

        System.out.println("=========================== LISTANDO ETIQUETAS ====================");
        service.listar().stream().forEach(x -> System.out.println(x.toString()));
    }
}
