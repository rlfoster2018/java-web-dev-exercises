package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparatorFlavor = new FlavorComparator();
        Comparator comparatorCone = new ConeComparator();

        flavors.sort(comparatorFlavor);
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).name);
        }

        cones.sort(comparatorCone);
        for (int j = 0; j < cones.size(); j++) {
            System.out.println(cones.get(j).name + ": $" + cones.get(j).cost);
        }

    }
}
