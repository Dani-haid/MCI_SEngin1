package mci.se1.ex3.nr3.builder.drink;

import java.util.ArrayList;

public interface DrinkBuilder {
    DrinkBuilder cream();
    DrinkBuilder milk();
    DrinkBuilder sugar();
    DrinkBuilder temperature(DrinkTemperature temperature);

    DrinkBuilder size(DrinkSize size);
    ArrayList<String> extras = new ArrayList<String>();

    Drink build();
}
