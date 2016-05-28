/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex.repository;

import com.ar.springex.domain.Alcance;
import com.ar.springex.domain.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author exb45049
 */
@Repository(value = "alcanceDao")
public class JPAAlcanceDao implements AlcanceDao {

    private EntityManager em = null;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    @Override
    public List<Product> getAll() {
        return em.createQuery("SELECT a FROM Alcance a ORDER BY a.id").getResultList();
    }

    @Transactional(readOnly = false)
    @Override
    public void save(Alcance alcance) {
        em.merge(alcance);
    }
}
