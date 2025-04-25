package com.taller1.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.taller1.Models.product;

@Repository
public class ProductRepository {

    //private final List<product> products = new ArrayList<>();
    public List<product> findAll() {
        List<product> products = new ArrayList<>();
        //electronics
        products.add(new product(1L, "pc desktop", "Electronics", 1.950000, 20));
        products.add(new product(2L, "laptop", "Electronics", 3500000.0, 15));
        products.add(new product(3L, "smartphone", "Electronics", 1200000.0, 30));
        products.add(new product(4L, "tablet", "Electronics", 2000000.0, 25));
        products.add(new product(5L, "smartwatch", "Electronics", 800000.0, 50));
        products.add(new product(6L, "headphones", "Electronics", 150000.0, 100));
        //appliances
        products.add(new product(7L, "television", "Appliances", 2000000.0, 15));
        products.add(new product(8L, "refrigerator", "Appliances", 5000000.0, 10));
        products.add(new product(9L, "microwave", "Appliances", 1000000.0, 20));
        products.add(new product(10L, "washing machine", "Appliances", 4500000.0, 8));
        products.add(new product(11L, "air conditioner", "Appliances", 6000000.0, 5));
        products.add(new product(12L, "vacuum cleaner", "Appliances", 2500000.0, 12));
        products.add(new product(13L, "blender", "Appliances", 800000.0, 25));

        //furniture
        products.add(new product(14L, "sofa", "Furniture", 3000000.0, 8));
        products.add(new product(15L, "dining table", "Furniture", 2000000.0, 10));
        products.add(new product(16L, "bed", "Furniture", 4000000.0, 5));
        products.add(new product(17L, "wardrobe", "Furniture", 2500000.0, 7));
        products.add(new product(18L, "desk", "Furniture", 1500000.0, 12));
        products.add(new product(19L, "chair", "Furniture", 800000.0, 20));
        products.add(new product(20L, "bookshelf", "Furniture", 1200000.0, 15));
        return products;
    }
}
