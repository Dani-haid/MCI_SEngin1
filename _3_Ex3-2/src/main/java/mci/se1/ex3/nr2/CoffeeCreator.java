package mci.se1.ex3.nr2;

public class CoffeeCreator extends AutomaticMachine{
    @Override
    public Drink createDrink(){
        return new Coffee();
    }
}
