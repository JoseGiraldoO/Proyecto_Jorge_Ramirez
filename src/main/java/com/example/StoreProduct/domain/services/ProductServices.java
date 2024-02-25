package com.example.StoreProduct.domain.services;

import com.example.StoreProduct.domain.Product;
import com.example.StoreProduct.persistence.ProductoRepository;
import com.example.StoreProduct.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Product> getAll() {

        return productoRepository.getAll();
    }


    public Optional<Product> getById(int idPro) {
        return productoRepository.getById(idPro);
    }

    public Product save(Product product) {

        return productoRepository.save(product);
    }

    public boolean delete(int idPro) {
        if(productoRepository.getById(idPro).isPresent()){
            productoRepository.delete(idPro);
            return true;
        }
        else return false;
    }

    public Product update(Product product, int idPro) {

        return productoRepository.update(product, idPro);
    }
}
