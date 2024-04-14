package com.example.appventascibertec.service;

import com.example.appventascibertec.model.bd.Product;

import java.util.List;

public interface IProductService {
    List<Product> listProducts();
    void RegisterProduct(Product product);

}
