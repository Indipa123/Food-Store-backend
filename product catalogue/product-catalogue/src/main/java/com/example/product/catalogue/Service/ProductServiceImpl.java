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
    public  Product getProductById(Long id){
        return productRepository.findById(id)
                .orElseThrow(()  -> new RuntimeException("Product not found"));
    }
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(Long id, Product product) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Product not found");
        }
        product.setId(id);
        return productRepository.save(product);
    }
    @Override
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Product not found");
        }
        productRepository.deleteById(id);
    }




}
