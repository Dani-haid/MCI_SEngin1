package mci.se1.ex3.nr3.builder.drink;

import java.util.ArrayList;

public class AmericanoBuilder implements DrinkBuilder{
    private boolean cream;
    private boolean milk;
    private boolean sugar;
    private DrinkTemperature temperature;
    private DrinkSize size;
    ArrayList<String> extras = new ArrayList<String>();


    public AmericanoBuilder(){
        this.cream = false;
        this.milk = false;
        this.sugar = false;
        this.temperature = DrinkTemperature.COLD;
        this.size = DrinkSize.SMALL;
    }
    public AmericanoBuilder cream(){
        this.cream = true;
        return this;
    }
    public AmericanoBuilder milk(){
        this.milk = true;
        return this;
    }
    public AmericanoBuilder sugar(){
        this.sugar = true;
        return this;
    }
    public AmericanoBuilder temperature(DrinkTemperature temperature){
        this.temperature = temperature;
        return this;
    }

    public AmericanoBuilder size(DrinkSize size){
        this.size = size;
        return this;
    }
    @Override
    public Drink build(){
        return new Americano(cream, milk, sugar, temperature, size);
    }
}

