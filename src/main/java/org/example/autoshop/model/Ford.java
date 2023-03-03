package org.example.autoshop.model;


public class Ford extends Car {
    private int year;
    private double discount;

    public Ford(int speed, double regularPrice, Color color, int year, double discount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.discount = discount;
    }

    @Override
    public double getSalePrice() {
        return super.getRegularPrice() - discount * super.getRegularPrice();
    }

    @Override
    public String toString() {
        return "Ford{" +
                super.toString() +
                "year=" + year +
                ", discount=" + discount +
                '}';
    }
}
