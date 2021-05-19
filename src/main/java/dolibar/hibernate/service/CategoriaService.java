/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.service;

import dolibar.hibernate.dao.CategoriaDao;
import dolibar.hibernate.dto.CategoriaDto;
import java.util.List;

/**
 *
 * @author PC
 */
public class CategoriaService {
    
    public List<CategoriaDto> listar() {
        CategoriaDao dao = new CategoriaDao();
        List<CategoriaDto> categoria = dao.listar();
        return categoria;
    }

    public void crear(CategoriaDto categoria) {
        CategoriaDao dao = new CategoriaDao();
        dao.insertar(categoria);
    }
    
    public void actualizar(CategoriaDto categoria){
        CategoriaDao dao = new CategoriaDao();
        dao.actualizar(categoria);
    }
    
    public CategoriaDto buscarById(CategoriaDto categoria){
        CategoriaDao dao = new CategoriaDao();
        CategoriaDto encontrado = dao.buscarById(categoria);
        return encontrado;
    }
    
    public void eliminar(CategoriaDto categoria){
        CategoriaDao dao = new CategoriaDao();
        dao.eliminar(categoria);
    }
    
}
