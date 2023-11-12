package mci.se1.ex3.nr3.builder.drink;

public interface DrinkBuilder {
    DrinkBuilder addCream();
    DrinkBuilder addMilk();
    DrinkBuilder addSugar();
    DrinkBuilder setTemperature(String temperature);
    DrinkBuilder setSize(String size);
    Drink build();
}
