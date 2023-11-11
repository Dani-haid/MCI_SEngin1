package mci.se1.ex3.nr2;

/**
 * creator
 */
public abstract class AutomaticMachine {
    /*
    private static AutomaticMachine instance;
    public static AutomaticMachine getInstance() {
        if(instance == null){
            instance = new AutomaticMachine();
        }
        return instance;
    }
    //private constructor for singleton pattern
    private AutomaticMachine(){}
    */

    public abstract Drink createDrink();

    public void orderDrink(){
        Drink drink = createDrink();
        drink.prepare();
        //return drink;
    }
}
