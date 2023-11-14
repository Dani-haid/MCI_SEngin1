package mci.se1.ex3.nr3.dataDefinition;

public enum DrinkName {
    ESPRESSO("espresso"),
    CAPPUCCINO("cappuccino"),
    AMERICANO("americano");
    private final String drinkName;

    DrinkName(String name){
        this.drinkName = name;
    }

    public String getDrinkName(){
        return drinkName;
    }
}
