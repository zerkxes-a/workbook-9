package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> getAll();
    public List<Product> getByProductId();
    public List<Product> getByProductName();
    public List<Product> getByCategory();
    public List<Product> getByPrice();
    public void delete();
    public void add(Product product);
}
