package com.example.StoreProduct.domain.services;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.persistence.CategoriaRepository;
import com.example.StoreProduct.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

   @Autowired
   private CategoriaRepository categoriaRepository;
    public List<Category> getAll() {

        return categoriaRepository.getAll();
    }

    public Optional<Category> getById(int idCa) {
        return categoriaRepository.getById(idCa);
    }

}
