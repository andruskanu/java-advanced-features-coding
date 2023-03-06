package org.example.weapon;

public class Main {

    public static void main(String[] args) {

        Magazine m1 = new Magazine(7);
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("1");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("2");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("3");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("4");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("5");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("6");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("7");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("8");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInMagazine("9");
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();

        // We need to load the first bullet into the chamber, before shooting or
        // after the last bullet was shot
        m1.loadBulletInChamber();

        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();


        m1.shoot();
        m1.shoot();

        m1.loadBulletInMagazine("7");
        m1.shoot();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.loadBulletInChamber();
        System.out.print("Magazine status: ");
        m1.displayIsMagazineLoaded();
        m1.shoot();

        System.out.println("Adding a new set of bullets: ");
        m1.loadBulletInMagazine("1");
        m1.loadBulletInMagazine("2");
        m1.loadBulletInMagazine("3");
        m1.loadBulletInMagazine("4");
        m1.loadBulletInMagazine("5");
        m1.loadBulletInMagazine("6");
        m1.loadBulletInMagazine("7");
        m1.displayIsMagazineLoaded();
    }
}
