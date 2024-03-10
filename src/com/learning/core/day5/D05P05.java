package com.learning.core.day5;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Product2 {
    String productId;
    private String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product2 other = (Product2) obj;
        return productId.equals(other.productId);
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P05 {
    public static void main(String[] args) {
        HashSet<Product2> products = new HashSet<>();

        // Add predefined products
        products.add(new Product2("P001", "Maruti 800"));
        products.add(new Product2("P002", "Maruti Zen"));
        products.add(new Product2("P003", "Maruti Dezire"));
        products.add(new Product2("P004", "Maruti Alto"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product ID to remove: ");
        String productIdToRemove = scanner.nextLine();

        Iterator<Product2> iterator = products.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Product2 product = iterator.next();
            if (product.productId.equals(productIdToRemove)) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Product removed successfully.");
            System.out.println("Remaining products:");
            for (Product2 product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("Product not found.");
        }

        scanner.close();
    }
}