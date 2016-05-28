/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.springex;

import com.ar.springex.domain.Product;
import com.ar.springex.service.ProductManager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author exb45049
 */
@RestController
public class AlcanceController {
    
    @Autowired
    private ProductManager pm;
    
    @RequestMapping(value = "/getallproducts/", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> listAllUsers() {
        List<Product> products = pm.getProducts();
        if(products.isEmpty()){
            return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }
}
