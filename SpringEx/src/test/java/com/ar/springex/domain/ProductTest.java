/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author exb45049
 */
public class ProductTest {

    private Product product;

    public ProductTest() {
    }

    @Before
    public void setUp() {
        product = new Product();
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    /**
     * Test of setDescription method, of class Product.
     */
    @Test
    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

    /**
     * Test of getPrice method, of class Product.
     */
//    @Test
//    public void testGetPrice() {
//        System.out.println("getPrice");
//        Product instance = new Product();
//        Double expResult = null;
//        Double result = instance.getPrice();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setPrice method, of class Product.
     */
//    @Test
//    public void testSetPrice() {
//        System.out.println("setPrice");
//        Double price = null;
//        Product instance = new Product();
//        instance.setPrice(price);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of toString method, of class Product.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Product instance = new Product();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
