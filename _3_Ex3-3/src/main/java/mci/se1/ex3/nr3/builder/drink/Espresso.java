package mci.se1.ex3.nr3.builder.drink;

import java.util.ArrayList;

public class Espresso implements Drink {
    private final boolean cream;
    private final boolean milk;
    private final boolean sugar;
    private final DrinkTemperature temperature;
    private final DrinkSize size;
    ArrayList<String> extras = new ArrayList<String>();


    protected Espresso(boolean cream, boolean milk, boolean sugar, DrinkTemperature temperature, DrinkSize size){
        this.cream = cream;
        this.milk = milk;
        this.sugar = sugar;
        this.temperature = temperature;
        this.size = size;
    }
    @Override
    public void prepare(){

        if(this.cream){
            extras.add("cream");
        }
        if(this.milk){
            extras.add("milk");
        }
        if(this.sugar){
            extras.add("sugar");
        }
        System.out.println("Voila - " + this.size + " and " + this.temperature + " Espresso for you! It contains "+ extras);
    }
}
