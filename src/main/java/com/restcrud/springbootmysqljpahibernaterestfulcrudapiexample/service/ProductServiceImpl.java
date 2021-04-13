package com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.service;

import com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.entity.Product;
import com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingPro = getProductById(product.getId());
        existingPro.setName(product.getName());
        existingPro.setQuantity(product.getQuantity());
        existingPro.setPrice(product.getPrice());
        return productRepository.save(existingPro);
    }

    @Override
    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product removed !! " + id;
    }
}
