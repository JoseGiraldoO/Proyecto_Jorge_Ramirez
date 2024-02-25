package com.example.StoreProduct.domain.repository;

import com.example.StoreProduct.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    List<Category> getAll();
    Optional<Category> getById(int idca);
}
