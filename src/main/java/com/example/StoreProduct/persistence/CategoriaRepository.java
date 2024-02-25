package com.example.StoreProduct.persistence;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.domain.repository.CategoryRepository;
import com.example.StoreProduct.persistence.crud.CategoriaCrudRepository;
import com.example.StoreProduct.persistence.entity.Categoria;
import com.example.StoreProduct.persistence.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository implements CategoryRepository {
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;
    @Override
    public List<Category> getAll() {
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return categoriaMapper.toCategorys(categorias);
    }

    @Override
    public Optional<Category> getById(int idCa) {
        return categoriaCrudRepository.findById(idCa).map(categoria -> categoriaMapper.toCategoria(categoria));
    }
}
