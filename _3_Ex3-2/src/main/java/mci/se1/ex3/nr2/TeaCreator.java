package mci.se1.ex3.nr2;

public class TeaCreator extends AutomaticMachine{
    @Override
    public Drink createDrink(){
        return new Tea();
    }
}
