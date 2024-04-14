package com.example.appventascibertec.service;

import com.example.appventascibertec.model.bd.Product;
import com.example.appventascibertec.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProductService implements IProductService{
    private ProductRepository productRepository;
    @Override
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public void RegisterProduct(Product product) {
        productRepository.save(product);
    }
}
