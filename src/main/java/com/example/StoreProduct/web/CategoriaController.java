package com.example.StoreProduct.web;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.domain.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoryServices categoryServices;
    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAll(){

        return new ResponseEntity<>(categoryServices.getAll(), HttpStatus.OK);
    }

    @GetMapping("{idCa}")
    public ResponseEntity<Category> getById(@PathVariable("idCa") int idCa){
        return categoryServices.getById(idCa).map(category -> new ResponseEntity<>(category,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
      }

