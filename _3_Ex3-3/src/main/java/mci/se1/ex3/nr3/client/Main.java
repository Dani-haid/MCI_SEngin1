package mci.se1.ex3.nr3.client;

import mci.se1.ex3.nr3.businessLogic.*;
import mci.se1.ex3.nr3.dataDefinition.*;

public class Main {
    public static void main(String[] args) {
        // there's only 1 Machine, get Instance of it
        AutomaticMachine automaticMachine = AutomaticMachine.getInstance();

        try {

            Drink capu = new Drink.DrinkBuilder(DrinkName.CAPPUCCINO)
                    .sugar()
                    .milk()
                    .temperature(DrinkTemperature.HOT)
                    .build();

            Drink espresso = new Drink.DrinkBuilder(DrinkName.ESPRESSO)
                    .cream()
                    .sugar()
                    .size(DrinkSize.SMALL)
                    .build();

            Drink americano = new Drink.DrinkBuilder(DrinkName.AMERICANO)
                    .sugar()
                    .temperature(DrinkTemperature.COLD)
                    .size(DrinkSize.LARGE)
                    .build();

            automaticMachine.prepare(capu);
            automaticMachine.prepare(espresso);
            automaticMachine.prepare(americano);

        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

    }
}
