package mci.se1.ex3.nr3;

import mci.se1.ex3.nr3.builder.drink.Drink;

public class AutomaticMachine {
    private static AutomaticMachine instance;
    public static AutomaticMachine getInstance() {
        if(instance == null){
            instance = new AutomaticMachine();
        }
        return instance;
    }
    private AutomaticMachine(){
        //private constructor for singleton pattern
    }

    public void prepare(Drink drink){
        drink.prepare();
    }
}

