package org.example.autoshop.model;

public class Mercedes extends Car {

    private String type;

    public Mercedes(int speed, double regularPrice, Color color, String type) {
        super(speed, regularPrice, color);
        this.type = type;
    }

    @Override
    public double getSalePrice() {
        return "diesel".equals(type) ?
                super.getRegularPrice() + super.getRegularPrice() * 0.10 :
                super.getRegularPrice() + super.getRegularPrice() * 0.05;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
