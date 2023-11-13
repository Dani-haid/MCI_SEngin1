package mci.se1.ex3.nr3;

import mci.se1.ex3.nr3.builder.drink.*;

public class Main {
    public static void main(String[] args) {
        // there's only 1 Machine, get Instance of it
        AutomaticMachine automaticMachine = AutomaticMachine.getInstance();

        DrinkBuilder capuBuilder = new CappuccinoBuilder();
        Drink capu = capuBuilder
                .cream()
                .milk()
                .size(DrinkSize.SMALL)
                .build();

        automaticMachine.prepare(capu);

        DrinkBuilder americanoBuilder = new AmericanoBuilder();
        Drink americano = americanoBuilder
                .milk()
                .sugar()
                .temperature(DrinkTemperature.WARM)
                .build();

        automaticMachine.prepare(americano);

        DrinkBuilder espressoBuilder = new EspressoBuilder();
        Drink espresso = espressoBuilder
                .sugar()
                .size(DrinkSize.MEDIUM)
                .build();

        automaticMachine.prepare(espresso);
    }
}
