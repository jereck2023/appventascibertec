package com.example.appventascibertec.service;

import com.example.appventascibertec.model.bd.Category;
import com.example.appventascibertec.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryService implements ICategoryService{

    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listarcategorias() {
        return categoryRepository.findAll();
    }
}
