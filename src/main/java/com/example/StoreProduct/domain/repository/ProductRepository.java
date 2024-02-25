package com.example.StoreProduct.domain.repository;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<Product> getById(int idPro);

    Product save (Product product);

    Product update (Product product, int idPro);

    void delete (int idPro);
}
