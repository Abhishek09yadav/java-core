package com.learning.core.day6;
import java.util.TreeMap;

class Car implements Comparable<Car> {
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
        return Double.valueOf(price).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0;
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

        Car car1 = new Car("Bugatti", 80050.0);
        Car car2 = new Car("Swift", 305000.0);
        Car car3 = new Car("Audi", 600100.0);
        Car car4 = new Car("Tesla", 75000.0);

        carMap.put(car1, car1.getName());
        carMap.put(car2, car2.getName());
        carMap.put(car3, car3.getName());
        carMap.put(car4, car4.getName());

        Car keyToReplace = new Car("Placeholder", 80050.0); // Key with target price
        carMap.put(keyToReplace, "Reva"); // Replace value for car with price 80050.0

        System.out.println("Cars after replacing value:");
        for (Car car : carMap.keySet()) {
            System.out.println(carMap.get(car) + " " + car.getPrice());
        }
    }
}
