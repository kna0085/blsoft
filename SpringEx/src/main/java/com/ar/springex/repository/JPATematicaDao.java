/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex.repository;

import com.ar.springex.domain.Tematica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author exb45049
 */
@Repository(value = "tematicaDao")
public class JPATematicaDao implements TematicaDao {

    private EntityManager em = null;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = false)
    @Override
    public void save(Tematica tematica) {
        em.merge(tematica);
    }

    public List<Tematica> getAll() {
        return em.createQuery("select t from Tematica t  order by t.id").getResultList();

    }
}
