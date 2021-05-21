package com.example.TASK1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @RequestMapping("/")
    public List<Product> get(Product product){
        return repo.findAll();
    }

    @PostMapping("/")
    public String add(@RequestBody Product product){
       repo.save(product);
       return product.toString();
    }

}
