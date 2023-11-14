package mci.se1.ex3.nr3.businessLogic;

import mci.se1.ex3.nr3.dataDefinition.*;

import java.util.HashSet;
import java.util.Set;

public class Drink {
    private final DrinkName name;
    private final boolean cream;
    private final boolean milk;
    private final boolean sugar;
    private final DrinkTemperature temperature;
    private final DrinkSize size;
    private final Set<String> extras = new HashSet<>(); //so extras can only be added once

    private Drink(DrinkBuilder builder) {
        this.name = builder.name;
        this.cream = builder.cream;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.temperature = builder.temperature;
        this.size = builder.size;
    }

    public static class DrinkBuilder {
        private final DrinkName name;
        private boolean cream = false;
        private boolean milk = false;
        private boolean sugar = false;
        private DrinkTemperature temperature = DrinkTemperature.WARM;
        private DrinkSize size = DrinkSize.MEDIUM;

        public DrinkBuilder(DrinkName name){
            this.name = name;
        }

        public DrinkBuilder cream(){
            this.cream = true;
            return this;
        }
        public DrinkBuilder milk(){
            this.milk = true;
            return this;
        }
        public DrinkBuilder sugar(){
            this.sugar = true;
            return this;
        }

        public DrinkBuilder temperature(DrinkTemperature temperature){
            this.temperature = temperature;
            return this;
        }

        public DrinkBuilder size(DrinkSize size){
            this.size = size;
            return this;
        }

        public Drink build(){
            if(name == null){
                throw new IllegalStateException("You need to set a drink name!");
            }
            return new Drink(this);
        }
    }


    private void addedExtras(){
        if(this.cream){
            extras.add("cream");
        }
        if(this.milk){
            extras.add("milk");
        }
        if(this.sugar){
            extras.add("sugar");
        }
    }

    /**
     * private to avoid prepare() is called directly
     */
    private void prepare(){
        addedExtras();
        System.out.println("There's your " + this.size + " and " + this.temperature
                + " " + this.name.getDrinkName() + " with "+ extras +  "- enjoy.");
    }

    public void prepareDrink(){
        prepare();
    }
}
