package com.learning.core.day6;

import java.util.TreeMap;
import java.util.Map;

class Car implements Comparable<Car5> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car5 car5 = (Car5) obj;
        return this.name.equals(car5.name);
    }

    @Override
    public int compareTo(Car5 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car5, String> cars = new TreeMap<>();

        // Predefined information of 4 cars
        cars.put(new Car5("Bugatti", 80050.0), "Bugatti");
        cars.put(new Car5("Swift", 305000.0), "Swift");
        cars.put(new Car5("Audi", 600100.0), "Audi");
        cars.put(new Car5("Tesla", 75000.0), "Tesla");

        // Remove the car with the lowest price
        cars.remove(cars.firstKey());

        // Get the key-value mapping associated with the greatest key
        Map.Entry<Car5, String> highestEntry = cars.lastEntry();
        System.out.println(highestEntry.getKey());
    }
}
