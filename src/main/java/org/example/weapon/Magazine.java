package org.example.weapon;

import java.util.ArrayDeque;

public class Magazine {

    private final int size;
    private ArrayDeque<String> magazineWithBullets;
    private boolean isBulletInChamber;

    public Magazine(final int size) {
        this.size = size;
        this.magazineWithBullets = new ArrayDeque<>();
    }

    public void loadBulletInMagazine(String bullet) {
        if (magazineWithBullets.size() < size) {
            magazineWithBullets.add(bullet);
            System.out.println("Adding bullet " + bullet + " to magazine.");
        } else {
            System.out.println("Magazine full.");
        }
    }

    public void displayIsMagazineLoaded() {
        if (!magazineWithBullets.isEmpty()) {
            System.out.print("Magazine is loaded with " + magazineWithBullets.size() + " bullet/s. Listing: ");
            for (String bullet : magazineWithBullets) {
                System.out.print(bullet + "; ");
            }
        } else {
            System.out.println("Magazine is empty");
        }
    }

    public void shoot() {
        if (isBulletInChamber) {
            System.out.println("Bang!");
            loadBulletInChamber();
        } else {
            System.out.println("Click");
        }
    }

    public void loadBulletInChamber() {
        if (!magazineWithBullets.isEmpty()) {
            magazineWithBullets.removeLast();
            System.out.println("Loading bullet in chamber...");
            isBulletInChamber = true;
        } else {
            System.out.println("Out of bullets, nothing to load in chamber.");
            isBulletInChamber = false;
        }
    }
}
