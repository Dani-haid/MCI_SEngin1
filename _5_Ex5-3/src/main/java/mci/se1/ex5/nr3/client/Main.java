package mci.se1.ex5.nr3.client;

import mci.se1.ex5.nr3.template.Apartment;
import mci.se1.ex5.nr3.template.BuildingTemplate;
import mci.se1.ex5.nr3.template.DetachedHouse;

/**
 * Design and implement a Java application that
 * simulates the way different types of houses
 * can be built. In order to build a house,
 * the following steps must be followed:
 * first the foundation of the house must be built,
 * second the walls of the house have to be built,
 * third the roof is to be placed, and eventually
 * door and windows can be set in the building.
 * The order of construction cannot be changed
 * (in fact, you cannot place the roof
 * if you do not first have the foundation!).
 */
public class Main {
    public static void main(String[] args) {
        BuildingTemplate house = new Apartment();
        house.buildHouse();

        System.out.println("----");

        house = new DetachedHouse();
        house.buildHouse();
    }
}