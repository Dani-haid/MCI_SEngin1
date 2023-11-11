package mci.se1.ex3.nr2;

public class Water implements Drink{
    @Override
    public void prepare(){
        System.out.println("--> Sorry - only water for you at the moment.");
    }
}
