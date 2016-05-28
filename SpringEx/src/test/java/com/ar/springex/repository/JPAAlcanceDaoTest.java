/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex.repository;

import com.ar.springex.domain.Alcance;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author exb45049
 */
public class JPAAlcanceDaoTest {

    private ApplicationContext context;
    private AlcanceDao alcanceDao;

    public JPAAlcanceDaoTest() {
    }

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        alcanceDao = (AlcanceDao) context.getBean("alcanceDao");
    }

    /**
     * Test of getAll method, of class JPAAlcanceDao.
     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        JPAAlcanceDao instance = new JPAAlcanceDao();
//        List<Product> expResult = null;
//        List<Product> result = instance.getAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of save method, of class JPAAlcanceDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Alcance a = new Alcance();
        a.setCodigo("ABC");
        a.setDescripcion("abcdef");
        a.setHabilitado(false);

        alcanceDao.save(a);

    }

}
