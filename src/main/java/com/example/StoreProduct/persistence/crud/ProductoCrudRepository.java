package com.example.StoreProduct.persistence.crud;

import com.example.StoreProduct.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
