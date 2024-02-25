package com.example.StoreProduct.persistence.mapper;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {


    @Mappings({
            @Mapping(source = "idCategoria", target = "idCa")
    })
    Category toCategoria(Categoria categoria);
    List<Category> toCategorys(List<Categoria> categoria);

    @InheritInverseConfiguration
    @Mapping(target = "product", ignore = true)
    Categoria toCategory(Category category);
}
