package mci.se1.ex3.nr3.client;

import mci.se1.ex3.nr3.businessLogic.*;
import mci.se1.ex3.nr3.dataDefinition.*;

public class Main {
    public static void main(String[] args) {
        // there's only 1 Machine, get Instance of it
        AutomaticMachine automaticMachine = AutomaticMachine.getInstance();

        Drink capu = new Drink.MyDrinkBuilder(DrinkName.CAPPUCCINO)
                        .sugar()
                        .milk()
                        .temperature(DrinkTemperature.HOT)
                        .build();

        Drink espresso = new Drink.MyDrinkBuilder(DrinkName.ESPRESSO)
                        .cream()
                        .sugar()
                        .size(DrinkSize.SMALL)
                        .build();

        Drink americano = new Drink.MyDrinkBuilder(DrinkName.AMERICANO)
                        .sugar()
                        .temperature(DrinkTemperature.COLD)
                        .size(DrinkSize.LARGE)
                        .build();

        automaticMachine.prepare(capu);
        automaticMachine.prepare(espresso);
        automaticMachine.prepare(americano);

    }
}
