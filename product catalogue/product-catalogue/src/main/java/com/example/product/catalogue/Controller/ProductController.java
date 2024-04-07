package com.example.product.catalogue.Controller;

import com.example.product.catalogue.Service.ProductService;
import com.example.product.catalogue.data.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }
    @PostMapping("create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
    @PutMapping("/{name}")
    public Product updateProduct(@PathVariable String name, @RequestBody Product product) {
        return productService.updateProduct(name, product);
    }

    @DeleteMapping("/{name}")
    public void deleteProduct(@PathVariable String name) {
        productService.deleteProductByName(name);
    }
}
