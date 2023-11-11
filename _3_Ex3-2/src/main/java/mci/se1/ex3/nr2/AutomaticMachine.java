package mci.se1.ex3.nr2;

/**
 * creator
 */
public class AutomaticMachine {
    private Drink currentDrink;
    private static AutomaticMachine instance;
    public static AutomaticMachine getInstance() {
        if(instance == null){
            instance = new AutomaticMachine();
        }
        return instance;
    }
    //private constructor for singleton pattern
    private AutomaticMachine(){}

    public void setCurrentDrink(Drink currentDrink) {
        this.currentDrink = currentDrink;
    }

    public void prepare(){
        currentDrink.prepare();
    }
}
