package mci.se1.ex3.nr3.builder.drink;

public interface DrinkBuilder {
    DrinkBuilder cream();
    DrinkBuilder milk();
    DrinkBuilder sugar();
    DrinkBuilder temperature(String temperature);
    DrinkBuilder size(String size);
    Drink build();
}
