package org.example.autoshop.model;

import org.example.autoshop.model.Car;
import org.example.autoshop.model.Color;

public class Truck extends Car {

    private int weight;

    public Truck(int speed, double regularPrice, Color color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;

    }

    public double getSalePrice() {
        double salePrice = super.getRegularPrice();
        if (weight > 2000) {
            salePrice = salePrice - 0.10 * salePrice;
        }
        return salePrice;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "weight=" + weight +
                '}';
    }
}