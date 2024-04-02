package com.example.product.catalogue.Service;

import com.example.product.catalogue.data.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id,Product product);
    void  deleteProduct(Long id);
}
