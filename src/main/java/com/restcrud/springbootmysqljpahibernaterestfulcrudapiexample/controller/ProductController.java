package com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.controller;

import com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.entity.Product;
import com.restcrud.springbootmysqljpahibernaterestfulcrudapiexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired private ProductService productService;

    @PostMapping("/product/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping("/product/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }
    @GetMapping("/product/list")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }


    @GetMapping("/product/name")
    public Product finProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }
    @PutMapping("/product/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }


}
