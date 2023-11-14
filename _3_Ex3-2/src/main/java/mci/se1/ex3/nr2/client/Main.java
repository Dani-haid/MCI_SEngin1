package mci.se1.ex3.nr2.client;

import mci.se1.ex3.nr2.businessLogic.*;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        AutomaticMachine automaticMachine = AutomaticMachine.getInstance();
        DrinkFactory drinkFactory = DrinkFactorySelector.selectDrinkFactory();

        automaticMachine.prepare(drinkFactory.createDrink());
    }
}
