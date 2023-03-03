package org.example.autoshop.model;

import org.example.autoshop.model.Car;
import org.example.autoshop.model.Color;

public class Sedan extends Car {

    private int length;

    public Sedan(int speed, double regularPrice, Color color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        double sellPrice = super.getRegularPrice();
        if (length > 20) {
            return sellPrice - 0.05 * sellPrice;
        }
        return sellPrice - 0.10 * sellPrice;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                super.toString() +
                "length=" + length +
                '}';
    }
}
