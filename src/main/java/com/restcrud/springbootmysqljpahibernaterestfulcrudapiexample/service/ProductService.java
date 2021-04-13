package com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.service;


import com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.entity.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> saveProducts(List<Product> products);
    public List<Product> getProducts();
    public Product getProductByName(String name);
    public Product getProductById(int id);
    public Product updateProduct(Product product);
    public String deleteProduct(int id);

}
