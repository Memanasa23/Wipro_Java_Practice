package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // CRUD
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByMake(String productMake) {
        return productRepository.findByProductMake(productMake);
    }

    public Product updateProduct(int id, Product updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setProductName(updatedProduct.getProductName());
            product.setProductMake(updatedProduct.getProductMake());
            product.setProductPrice(updatedProduct.getProductPrice());
            return productRepository.save(product);
        }).orElse(null);
    }
}
