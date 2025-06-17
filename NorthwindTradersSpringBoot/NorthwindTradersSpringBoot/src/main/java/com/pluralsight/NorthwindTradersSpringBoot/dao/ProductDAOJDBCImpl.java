package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;

@Component
public class ProductDAOJDBCImpl implements ProductDAO{
    private List<Product> products;
    private DataSource dataSource;

    @Autowired
    public ProductDAOJDBCImpl(DataSource dataSource) {
        this.products = new ArrayList<>();
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        this.products.clear();
        String sql = "SELECT ProductID, ProductName, CategoryID, UnitPrice FROM Products;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                this.products.add(new Product(rows.getInt(1), rows.getString(2), rows.getString(3), rows.getDouble(4)));

            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return this.products;
    }

    @Override
    public List<Product> getByProductId() {
        return null;
    }

    @Override
    public List<Product> getByProductName() {
        return null;
    }

    @Override
    public List<Product> getByCategory() {
        return null;
    }

    @Override
    public List<Product> getByPrice() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void add(Product product) {
        this.products.add(product);
    }
}


