/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.hibernate.dao;

import dolibar.hibernate.dto.TerceroDto;
import dolibar.hibernate.entity.Tercero;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class TerceroDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public TerceroDao() {
        emf = Persistence.createEntityManagerFactory("Hibernate");
        em = emf.createEntityManager();
    }

    public List<TerceroDto> listar() {
        List<TerceroDto> dto = new ArrayList<>();
        try {
            Query query = em.createQuery("SELECT p FROM Tercero p");

            List<Tercero> tercero = query.getResultList();

            tercero.stream().forEach(x -> {
                TerceroDto terDto = new TerceroDto();
                terDto.setIdTerceros(x.getIdTerceros());
                terDto.setNombreTerceros(x.getNombreTerceros());
                terDto.setTipoTerceros(x.getTipoTerceros());
                terDto.setDireccionTerceros(x.getDireccionTerceros());
                terDto.setCodigopostalTerceros(x.getCodigopostalTerceros());
                terDto.setPaisTerceros(x.getPaisTerceros());
                terDto.setProvinciaTerceros(x.getProvinciaTerceros());
                terDto.setRfcTerceros(x.getRfcTerceros());
                terDto.setImpuestoTerceros(x.getImpuestoTerceros());
                terDto.setFormaJuridicaterceros(x.getFormaJuridicaterceros());
                terDto.setIncotermsTerceros(x.getIncotermsTerceros());
                terDto.setRpimssTerceros(x.getRpimssTerceros());
                dto.add(terDto);
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

    public void insertar(TerceroDto tercero) {

        try {
            em.getTransaction().begin();

            Tercero ter = new Tercero();
            ter.setNombreTerceros(tercero.getNombreTerceros());
            ter.setTipoTerceros(tercero.getTipoTerceros());
            ter.setDireccionTerceros(tercero.getDireccionTerceros());
            ter.setCodigopostalTerceros(tercero.getCodigopostalTerceros());
            ter.setPaisTerceros(tercero.getPaisTerceros());
            ter.setProvinciaTerceros(tercero.getProvinciaTerceros());
            ter.setRfcTerceros(tercero.getRfcTerceros());
            ter.setImpuestoTerceros(tercero.getImpuestoTerceros());
            ter.setFormaJuridicaterceros(tercero.getFormaJuridicaterceros());
            ter.setIncotermsTerceros(tercero.getIncotermsTerceros());
            ter.setRpimssTerceros(tercero.getRpimssTerceros());

            em.persist(ter);
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

    public void actualizar(TerceroDto tercero) {

        try {
            em.getTransaction().begin();

            Tercero ter = new Tercero();
            ter.setIdTerceros(tercero.getIdTerceros());
            ter.setNombreTerceros(tercero.getNombreTerceros());
            ter.setTipoTerceros(tercero.getTipoTerceros());
            ter.setDireccionTerceros(tercero.getDireccionTerceros());
            ter.setCodigopostalTerceros(tercero.getCodigopostalTerceros());
            ter.setPaisTerceros(tercero.getPaisTerceros());
            ter.setProvinciaTerceros(tercero.getProvinciaTerceros());
            ter.setRfcTerceros(tercero.getRfcTerceros());
            ter.setImpuestoTerceros(tercero.getImpuestoTerceros());
            ter.setFormaJuridicaterceros(tercero.getFormaJuridicaterceros());
            ter.setIncotermsTerceros(tercero.getIncotermsTerceros());
            ter.setRpimssTerceros(tercero.getRpimssTerceros());

            em.merge(ter);
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

    public TerceroDto buscarById(TerceroDto tercero) {
        TerceroDto terceroDto = new TerceroDto();
        try {
            Tercero terceroEncontrado = em.find(Tercero.class, tercero.getIdTerceros());

            terceroDto.setIdTerceros(terceroEncontrado.getIdTerceros());
            terceroDto.setNombreTerceros(terceroEncontrado.getNombreTerceros());
            terceroDto.setTipoTerceros(terceroEncontrado.getTipoTerceros());
            terceroDto.setDireccionTerceros(terceroEncontrado.getDireccionTerceros());
            terceroDto.setCodigopostalTerceros(terceroEncontrado.getCodigopostalTerceros());
            terceroDto.setPaisTerceros(terceroEncontrado.getPaisTerceros());
            terceroDto.setProvinciaTerceros(terceroEncontrado.getProvinciaTerceros());
            terceroDto.setRfcTerceros(terceroEncontrado.getRfcTerceros());
            terceroDto.setImpuestoTerceros(terceroEncontrado.getImpuestoTerceros());
            terceroDto.setFormaJuridicaterceros(terceroEncontrado.getFormaJuridicaterceros());
            terceroDto.setIncotermsTerceros(terceroEncontrado.getIncotermsTerceros());
            terceroDto.setRpimssTerceros(terceroEncontrado.getRpimssTerceros());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro");
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return terceroDto;
    }

    public void eliminar(TerceroDto tercero) {
        try {
            em.getTransaction().begin();
            
            Tercero terceroEliminar = new Tercero();
            terceroEliminar.setIdTerceros(tercero.getIdTerceros());
            terceroEliminar.setNombreTerceros(tercero.getNombreTerceros());
            terceroEliminar.setTipoTerceros(tercero.getTipoTerceros());
            terceroEliminar.setDireccionTerceros(tercero.getDireccionTerceros());
            terceroEliminar.setCodigopostalTerceros(tercero.getCodigopostalTerceros());
            terceroEliminar.setPaisTerceros(tercero.getPaisTerceros());
            terceroEliminar.setProvinciaTerceros(tercero.getProvinciaTerceros());
            terceroEliminar.setRfcTerceros(tercero.getRfcTerceros());
            terceroEliminar.setImpuestoTerceros(tercero.getImpuestoTerceros());
            terceroEliminar.setFormaJuridicaterceros(tercero.getFormaJuridicaterceros());
            terceroEliminar.setIncotermsTerceros(tercero.getIncotermsTerceros());
            terceroEliminar.setRpimssTerceros(tercero.getRpimssTerceros());
            
            em.remove(em.merge(terceroEliminar));
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
