package com.example.product.catalogue.Service;

import com.example.product.catalogue.data.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductByName(String name);
    Product createProduct(Product product);
    Product updateProduct(String name, Product product); // Changed parameter to name
    void deleteProductByName(String name); // Changed to deleteProductByName
}
