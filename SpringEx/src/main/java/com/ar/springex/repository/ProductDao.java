/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex.repository;

import com.ar.springex.domain.Product;
import java.util.List;

/**
 *
 * @author exb45049
 */
public interface ProductDao {

    List<Product> getProductList();

    void saveProduct(Product prod);

}
