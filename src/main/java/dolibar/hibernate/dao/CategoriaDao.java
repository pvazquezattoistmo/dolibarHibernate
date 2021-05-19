/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.dao;

import dolibar.hibernate.dto.CategoriaDto;
import dolibar.hibernate.entity.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class CategoriaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CategoriaDao() {
        emf = Persistence.createEntityManagerFactory("Hibernate");
        em = emf.createEntityManager();
    }

    public List<CategoriaDto> listar() {
        List<CategoriaDto> dto = new ArrayList<>();
        try {
            Query query = em.createQuery("SELECT c FROM Categoria c");

            List<Categoria> categoria = query.getResultList();

            categoria.stream().forEach(x -> {
                CategoriaDto catDto = new CategoriaDto();

                catDto.setIdCategorias(x.getIdCategorias());
                catDto.setReferenciaCategorias(x.getReferenciaCategorias());
                catDto.setDescripcionCategorias(x.getDescripcionCategorias());
                catDto.setTipoCategorias(x.getTipoCategorias());

                dto.add(catDto);
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error en el listado");
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return dto;
    }

    public void insertar(CategoriaDto categoria) {

        try {
            em.getTransaction().begin();

            Categoria cat = new Categoria();
            cat.setDescripcionCategorias(categoria.getDescripcionCategorias());
            cat.setReferenciaCategorias(categoria.getReferenciaCategorias());
            cat.setTipoCategorias(categoria.getTipoCategorias());

            em.persist(cat);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ah ocurrido un error en el insertar");
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(CategoriaDto categoria) {

        try {
            em.getTransaction().begin();

            Categoria cat = new Categoria();
            
            cat.setIdCategorias(categoria.getIdCategorias());
            cat.setDescripcionCategorias(categoria.getDescripcionCategorias());
            cat.setReferenciaCategorias(categoria.getReferenciaCategorias());
            cat.setTipoCategorias(categoria.getTipoCategorias());

            em.merge(cat);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ah ocurrido un error en el actualizar");
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public CategoriaDto buscarById(CategoriaDto categoria) {
        CategoriaDto categoriaDto = new CategoriaDto();
        try {
            Categoria catEncontrado = em.find(Categoria.class, categoria.getIdCategorias());

            categoriaDto.setIdCategorias(catEncontrado.getIdCategorias());
            categoriaDto.setDescripcionCategorias(catEncontrado.getDescripcionCategorias());
            categoriaDto.setReferenciaCategorias(catEncontrado.getReferenciaCategorias());
            categoriaDto.setTipoCategorias(catEncontrado.getTipoCategorias());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro");
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return categoriaDto;
    }

    public void eliminar(CategoriaDto categoria) {
        try {
            em.getTransaction().begin();

            Categoria categoriaEliminar = new Categoria();

            categoriaEliminar.setIdCategorias(categoria.getIdCategorias());
            categoriaEliminar.setDescripcionCategorias(categoria.getDescripcionCategorias());
            categoriaEliminar.setReferenciaCategorias(categoria.getReferenciaCategorias());
            categoriaEliminar.setTipoCategorias(categoria.getTipoCategorias());

            em.remove(em.merge(categoriaEliminar));
            em.getTransaction().commit();
            System.out.println("Se ha eliminado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ocurrio un error al eliminar");
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
