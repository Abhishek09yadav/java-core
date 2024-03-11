package com.learning.core.day6;

import java.util.Map;
import java.util.TreeMap;

class Car5 implements Comparable<Car5> {
    String name;
    double price;

    public Car5(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car5 other = (Car5) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }

    @Override
    public int compareTo(Car5 other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P05 {

    public static void main(String[] args) {
        // Predefined car details
        Car5 car51 = new Car5("Bugatti", 80050.0);
        Car5 car52 = new Car5("Swift", 305000.0);
        Car5 car53 = new Car5("Audi", 600100.0);
        Car5 car54 = new Car5("Benz", 900000.0);

        // Store cars in TreeMap with natural ordering (sorted by name)
        TreeMap<Car5, Integer> carMap = new TreeMap<>();
        carMap.put(car51, 1);
        carMap.put(car52, 2);
        carMap.put(car53, 3);
        carMap.put(car54, 4);

        // Retrieve all car details
        for (Map.Entry<Car5, Integer> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}