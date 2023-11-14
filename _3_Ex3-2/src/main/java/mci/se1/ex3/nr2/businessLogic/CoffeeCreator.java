package mci.se1.ex3.nr2.businessLogic;

public class CoffeeCreator implements DrinkFactory {
    @Override
    public Drink createDrink(){
        return new Coffee();
    }
}
