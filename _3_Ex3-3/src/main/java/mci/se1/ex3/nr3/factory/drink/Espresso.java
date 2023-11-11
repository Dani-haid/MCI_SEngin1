package mci.se1.ex3.nr3.factory.drink;

public class Espresso implements Drink{
    @Override
    public void prepare(){
        System.out.println("Esspresso for you!");
    }
}
