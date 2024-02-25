package com.example.StoreProduct.persistence.mapper;

import com.example.StoreProduct.domain.Product;
import com.example.StoreProduct.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoriaMapper.class})
public interface ProductoMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "idPro"),
            @Mapping(source = "categoria", target = "categ")
    })
    Product toProduct(Producto producto);

    List<Product> toProducts(List<Producto> producto);

    @InheritInverseConfiguration
    Producto toProducto(Product product);


}
