package org.example.autoshop;

import org.example.autoshop.model.*;

public class MyOwnAutoShop {

    public static void main(String[] args) {

        Sedan sedan = new Sedan(220,15000, Color.BLACK,25);
        Ford fordFocus = new Ford(240,17000,Color.WHITE,2021,0.05);
        Ford fordFiesta = new Ford(235,14000,Color.RED,2020,0.10);
        Truck volvo = new Truck(90,90000,Color.BLUE,25000);
        Mercedes mercedes = new Mercedes(260, 35000,Color.GRAY, null);

        System.out.println(sedan.getSalePrice());
        System.out.println(fordFocus.getSalePrice());
        System.out.println(fordFiesta.getSalePrice());
        System.out.println(volvo.getSalePrice());
        System.out.println(mercedes.getSalePrice());

        System.out.println(sedan);
        System.out.println(fordFocus);
        System.out.println(fordFiesta);
        System.out.println(volvo);
        System.out.println(mercedes);

        displayMessageBasedOnInstance(sedan);
        displayMessageBasedOnInstance(fordFocus);
        displayMessageBasedOnInstance(volvo);
    }

    private static void displayMessageBasedOnInstance(Car car){
        if(car instanceof Sedan){
            System.out.println("Sedan...");
        }else if(car instanceof Ford){
            System.out.println("Ford...");
        }else if(car instanceof Truck){
            System.out.println("Truck...");
        }else{
            System.out.println("Other Car...");
        }
        System.out.println("Checked!");
    }
}
