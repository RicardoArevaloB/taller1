package com.taller1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import com.taller1.Models.product;
import com.taller1.Repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/api")
public class ProductController {
    private final ProductRepository repo;
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/products")
    public String getProducts(
        @RequestParam(required = false) Double minPrice,
        @RequestParam(required = false) Double maxPrice,
        @RequestParam(required = false) String category,
        Model model
        ){
           
        List<product> productFilter = repo.findAll().stream()
            .filter(product -> minPrice == null || product.getPrice() >= minPrice)
            .filter(product -> maxPrice == null || product.getPrice() <= maxPrice)
            .filter(product -> category == null || product.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.toList());
        model.addAttribute("products", productFilter);
        return "index";
                
        }
}
