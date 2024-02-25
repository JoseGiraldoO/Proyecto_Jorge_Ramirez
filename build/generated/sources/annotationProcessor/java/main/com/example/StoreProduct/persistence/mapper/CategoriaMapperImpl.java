package com.example.StoreProduct.persistence.mapper;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.persistence.entity.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T21:32:48-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public Category toCategoria(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        Category category = new Category();

        category.setIdCa( categoria.getIdCategoria() );
        category.setDescripcion( categoria.getDescripcion() );
        category.setEstado( categoria.getEstado() );

        return category;
    }

    @Override
    public List<Category> toCategorys(List<Categoria> categoria) {
        if ( categoria == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoria.size() );
        for ( Categoria categoria1 : categoria ) {
            list.add( toCategoria( categoria1 ) );
        }

        return list;
    }

    @Override
    public Categoria toCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setIdCategoria( category.getIdCa() );
        categoria.setDescripcion( category.getDescripcion() );
        categoria.setEstado( category.getEstado() );

        return categoria;
    }
}
