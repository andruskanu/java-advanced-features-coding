package org.example.autoshop.model;

public abstract class Car {

    private int speed;
    private double regularPrice;
    private Color color;

    public Car(int speed, double regularPrice, Color color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    protected double getRegularPrice() {
        return regularPrice;
    }

    public abstract double getSalePrice();


    @Override
    public String toString() {
        return  "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color=" + color +
                ", ";
    }
}

