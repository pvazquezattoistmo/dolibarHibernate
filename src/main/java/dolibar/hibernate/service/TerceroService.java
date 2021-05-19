/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.service;

import dolibar.hibernate.dao.TerceroDao;
import dolibar.hibernate.dto.TerceroDto;
import java.util.List;

/**
 *
 * @author PC
 */
public class TerceroService {

    public List<TerceroDto> listar() {
        TerceroDao dao = new TerceroDao();
        List<TerceroDto> tercero = dao.listar();
        return tercero;
    }

    public void crear(TerceroDto ter) {
        TerceroDao dao = new TerceroDao();
        dao.insertar(ter);
    }
    
    public void actualizar(TerceroDto ter){
        TerceroDao dao = new TerceroDao();
        dao.actualizar(ter);
    }
    
    public TerceroDto buscarById(TerceroDto ter){
        TerceroDao dao = new TerceroDao();
        TerceroDto encontrado = dao.buscarById(ter);
        return encontrado;
    }
    
    public void eliminar(TerceroDto tercero){
        TerceroDao dao = new TerceroDao();
        dao.eliminar(tercero);
    }
}
