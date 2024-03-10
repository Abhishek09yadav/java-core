package com.learning.core.day5;

import java.util.HashSet;

public class D05P03 {
    public static void main(String[] args) {
        HashSet<Product1> products = new HashSet<>();
        products.add(new Product1("P001", "Maruti 800"));
        products.add(new Product1("P002", "Maruti Zen"));
        products.add(new Product1("P003", "Maruti Dezire"));
        products.add(new Product1("P004", "Maruti Alto"));
        for(Product1 p : products){
            System.out.println(p);
        }
    }
}

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }

}