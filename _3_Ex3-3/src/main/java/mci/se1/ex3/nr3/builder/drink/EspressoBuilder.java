package mci.se1.ex3.nr3.builder.drink;

import java.util.ArrayList;

public class EspressoBuilder implements DrinkBuilder {
    private  boolean cream;
    private  boolean milk;
    private  boolean sugar;
    private  DrinkTemperature temperature;
    private  DrinkSize size;
    ArrayList<String> extras = new ArrayList<String>();


    public EspressoBuilder(){
        this.cream = false;
        this.milk = false;
        this.sugar = false;
        this.temperature = DrinkTemperature.HOT;
        this.size = DrinkSize.LARGE;
    }

    public EspressoBuilder cream(){
        this.cream = true;
        return this;
    }
    public EspressoBuilder milk(){
        this.milk = true;
        return this;
    }
    public EspressoBuilder sugar(){
        this.sugar = true;
        return this;
    }
    public EspressoBuilder temperature(DrinkTemperature temperature){
        this.temperature = temperature;
        return this;
    }
    public EspressoBuilder size(DrinkSize size){
        this.size = size;
        return this;
    }
    @Override
    public Drink build(){
        return new Espresso(cream, milk, sugar, temperature, size);
    }
}
