package mci.se1.ex3.nr2.businessLogic;

public class Tea implements Drink{
    @Override
    public void prepare(){
        System.out.println("--> Tea is beeing prepared.");
    }
}
