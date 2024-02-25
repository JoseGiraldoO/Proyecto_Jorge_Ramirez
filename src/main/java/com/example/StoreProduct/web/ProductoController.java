package com.example.StoreProduct.web;

import com.example.StoreProduct.domain.Category;
import com.example.StoreProduct.domain.Product;
import com.example.StoreProduct.domain.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/all")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Product>> getAll(){

        return new ResponseEntity<>(productServices.getAll(), HttpStatus.OK);
    }

    @GetMapping("{idPro}")
    public ResponseEntity<Product> getById(@PathVariable("idPro") int idPro){
        return productServices.getById(idPro).map(product -> new ResponseEntity<>(product,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
    @PostMapping("/save")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(productServices.save(product), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{idPro}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Product> delete(@PathVariable("idPro") int idPro){
        if(productServices.delete(idPro)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else { return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{idPro}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable("idPro") int idPro){
        return new ResponseEntity<>(productServices.update(product, idPro), HttpStatus.OK);
    }

}
