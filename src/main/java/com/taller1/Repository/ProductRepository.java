package com.taller1.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.taller1.Models.product;

public class ProductRepository {
    
    public Map<String, Object> index(Model model){
        Product product = new Product();
    }
    private final List<product> products = new ArrayList<>();
    public List<product> findAll() {
        return products;
    }
}
