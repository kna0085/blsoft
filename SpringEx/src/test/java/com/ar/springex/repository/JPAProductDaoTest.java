/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex.repository;

import com.ar.springex.domain.Product;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author exb45049
 */
public class JPAProductDaoTest {

    private ApplicationContext context;
    private ProductDao productDao;

    public JPAProductDaoTest() {
    }

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        productDao = (ProductDao) context.getBean("productDao");
    }

    /**
     * Test of getProductList method, of class JPAProductDao.
     */
    @Test
    public void testGetProductList() {

        List<Product> result = productDao.getProductList();
        assertEquals(result.size(), 3, 0);

    }

    /**
     * Test of saveProduct method, of class JPAProductDao.
     */
    @Test
    public void testSaveProduct() {
        List<Product> products = productDao.getProductList();

        Product p = products.get(0);
        Double price = p.getPrice();
        p.setPrice(200.12);
        productDao.saveProduct(p);

        List<Product> updatedProducts = productDao.getProductList();
        Product p2 = updatedProducts.get(0);
        assertEquals(p2.getPrice(), 200.12, 0);

        p2.setPrice(price);
        productDao.saveProduct(p2);
    }

}
