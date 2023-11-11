package mci.se1.ex3.nr3.factory;

public class Americano implements Drink{
    @Override
    public void prepare(){
        System.out.println("That's an Americano - enjoy.");
    }
}
