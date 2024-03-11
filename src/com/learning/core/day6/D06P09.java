package com.learning.core.day6;
import java.util.TreeMap;

class Car9 implements Comparable<Car9> {
    private String name;
    private double price;

    public Car9(String name, double price) {
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
        return Double.valueOf(price).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car9 car = (Car9) obj;
        return Double.compare(car.price, price) == 0;
    }

    @Override
    public int compareTo(Car9 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car9, String> carMap = new TreeMap<>();

        Car9 car1 = new Car9("Bugatti", 80050.0);
        Car9 car2 = new Car9("Swift", 305000.0);
        Car9 car3 = new Car9("Audi", 600100.0);
        Car9 car4 = new Car9("Tesla", 75000.0);

        carMap.put(car1, car1.getName());
        carMap.put(car2, car2.getName());
        carMap.put(car3, car3.getName());
        carMap.put(car4, car4.getName());

        Car9 keyToReplace = new Car9("Placeholder", 80050.0); // Key with target price
        carMap.put(keyToReplace, "Reva"); // Replace value for car with price 80050.0

        System.out.println("Cars after replacing value:");
        for (Car9 car : carMap.keySet()) {
            System.out.println(carMap.get(car) + " " + car.getPrice());
        }
    }
}
