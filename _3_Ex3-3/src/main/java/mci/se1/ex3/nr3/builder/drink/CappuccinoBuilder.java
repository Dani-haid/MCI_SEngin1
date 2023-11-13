package mci.se1.ex3.nr3.builder.drink;

import java.util.ArrayList;

public class CappuccinoBuilder implements DrinkBuilder{
    private boolean cream;
    private boolean milk;
    private boolean sugar;
    private DrinkTemperature temperature;
    private DrinkSize size;
    ArrayList<String> extras = new ArrayList<String>();


    public CappuccinoBuilder(){
        this.cream = false;
        this.milk = false;
        this.sugar = false;
        this.temperature = DrinkTemperature.WARM;
        this.size = DrinkSize.MEDIUM;
    }

    public CappuccinoBuilder cream(){
        this.cream = true;
        return this;
    }

    public CappuccinoBuilder milk(){
        this.milk = true;
        return this;
    }

    public CappuccinoBuilder sugar(){
        this.sugar = true;
        return this;
    }

    public CappuccinoBuilder temperature(DrinkTemperature temperature){
        this.temperature = temperature;
        return this;
    }

    public CappuccinoBuilder size(DrinkSize size){
        this.size = size;
        return this;
    }

    @Override
    public Drink build(){
        return new Cappuccino(cream, milk, sugar, temperature, size);
    }
}
