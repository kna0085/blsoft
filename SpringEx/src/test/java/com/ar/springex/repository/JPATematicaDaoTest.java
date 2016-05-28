package com.ar.springex.repository;

import com.ar.springex.domain.Tematica;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author exb45049
 */
public class JPATematicaDaoTest {

    private ApplicationContext context;
    private TematicaDao tematicaDao;

    public JPATematicaDaoTest() {
    }

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        tematicaDao = (TematicaDao) context.getBean("tematicaDao");
    }

    /**
     * Test of save method, of class JPATematicaDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Tematica tematica = new Tematica();
        tematica.setCodigo("AC2");
        tematica.setDescripcion("Aced");
        tematica.setHabilitado(true);

        tematicaDao.save(tematica);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getAll method, of class JPATematicaDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Tematica> expResult = tematicaDao.getAll();
//        List<Tematica> result = instance.getAll();
//        assertEquals(expResult.size(), 15);
        // TODO review the generated test code and remove the default call to fail.

    }

}
