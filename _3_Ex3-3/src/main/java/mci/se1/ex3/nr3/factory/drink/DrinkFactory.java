package mci.se1.ex3.nr3.factory.drink;

public abstract class DrinkFactory {
    public void orderDrink(){
        Drink drink = createDrink();
        drink.prepare();
    }

    public abstract Drink createDrink();
}
