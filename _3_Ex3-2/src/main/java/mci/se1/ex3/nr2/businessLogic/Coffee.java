package mci.se1.ex3.nr2.businessLogic;

public class Coffee implements Drink{
    @Override
    public void prepare(){
        System.out.println("--> oh yes! Coffee is beeing prepared.");
    }
}
