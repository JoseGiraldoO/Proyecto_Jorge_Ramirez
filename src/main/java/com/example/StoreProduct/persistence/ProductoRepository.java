package com.example.StoreProduct.persistence;

import com.example.StoreProduct.domain.Product;
import com.example.StoreProduct.domain.repository.ProductRepository;
import com.example.StoreProduct.persistence.crud.ProductoCrudRepository;
import com.example.StoreProduct.persistence.entity.Producto;
import com.example.StoreProduct.persistence.mapper.ProductoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

   @Autowired
   private ProductoCrudRepository productoCrudRepository;

   @Autowired
   private ProductoMapper productoMapper;

    @Override
    public List<Product> getAll() {
        List<Producto> products = (List<Producto>) productoCrudRepository.findAll();
        return productoMapper.toProducts(products);
    }
    @Override
    public Optional<Product> getById(int idPro) {
        return productoCrudRepository.findById(idPro).map(producto -> productoMapper.toProduct(producto));
    }
    @Override
    public Product save(Product product) {
        Producto producto = productoMapper.toProducto(product);
        return productoMapper.toProduct(productoCrudRepository.save(producto));
    }
    @Override
    public Product update(Product product, int idPro) {
        return productoCrudRepository.findById(idPro).map(producto -> {

            product.setNombre(product.getNombre());
            product.setIdCategoria(product.getIdCategoria());
            product.setCodigoBarras(product.getCodigoBarras());
            product.setPrecioVenta(product.getPrecioVenta());
            product.setCantidadStock(product.getCantidadStock());
            producto = productoMapper.toProducto(product);
            return productoMapper.toProduct(productoCrudRepository.save(producto));
        }).get();
    }
    @Override
    public void delete(int idPro) {
        productoCrudRepository.deleteById(idPro);
    }
}
