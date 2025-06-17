package com.pluralsight.NorthwindTradersSpringBoot.service;


import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {


    private final ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void addProduct(Product product) {
        productDAO.add(product);
    }

    public List<Product> getAllProducts() {
        return productDAO.getAll();
    }

}