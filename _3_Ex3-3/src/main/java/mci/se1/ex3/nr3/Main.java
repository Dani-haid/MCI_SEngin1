package mci.se1.ex3.nr3;

import mci.se1.ex3.nr3.builder.drink.*;

public class Main {
    public static void main(String[] args) {
        // there's only 1 Machine, get Instance of it
        AutomaticMachine automaticMachine = AutomaticMachine.getInstance();

        DrinkBuilder capuBuilder = new CappuccinoBuilder();
        Drink capu = capuBuilder
                .addCream()
                .addMilk()
                .setSize("small")
                .build();

        capu.prepare();

        DrinkBuilder americanoBuilder = new AmericanoBuilder();
        Drink americano = americanoBuilder
                .addMilk()
                .addSugar()
                .setTemperature("cold")
                .build();

        americano.prepare();

        DrinkBuilder espressoBuilder = new EspressoBuilder();
        Drink espresso = espressoBuilder
                .addSugar()
                .setSize("medium")
                .build();

        espresso.prepare();


    }
}
