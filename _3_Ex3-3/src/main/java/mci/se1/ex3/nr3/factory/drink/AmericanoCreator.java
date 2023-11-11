package mci.se1.ex3.nr3.factory.drink;

public class AmericanoCreator extends DrinkFactory{
    @Override
    public Drink createDrink(){
        return new Americano();
    }
}
