package com.example.product.catalogue.Service;

import com.example.product.catalogue.data.Product;
import com.example.product.catalogue.data.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public  Product getProductByName(String name){
        return productRepository.findByName(name)
                .orElseThrow(()  -> new RuntimeException("Product not found"));
    }
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(String name, Product product) { // Changed method signature to use name instead of id
        Product existingProduct = productRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setId(existingProduct.getId());
        return productRepository.save(product);
    }
    @Override
    public void deleteProductByName(String name) { // Changed method signature to use name instead of id
        Product existingProduct = productRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(existingProduct);
    }




}
