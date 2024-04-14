package com.example.appventascibertec.repository;

import com.example.appventascibertec.model.bd.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
