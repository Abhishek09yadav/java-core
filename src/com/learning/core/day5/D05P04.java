package com.learning.core.day5;

import java.util.*;

class Product1 {
    private String productId;
    private String productName;

    public Product1(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P04 {
    public static void main(String[] args) {
        // Create products
        Product1 product1 = new Product1("P001", "Maruti 800");
        Product1 product2 = new Product1("P002", "Maruti Zen");
        Product1 product3 = new Product1("P003", "Maruti Dezire");
        Product1 product4 = new Product1("P004", "Maruti Alto");

        // Store products in a HashSet
        Set<Product1> productSet = new HashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);

        // Search for a particular product
        String searchInput = "P003 Maruti Dezire";
        boolean found = false;
        for (Product1 product : productSet) {
            if (product.toString().equals(searchInput)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}
