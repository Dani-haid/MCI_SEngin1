package mci.se1.ex3.nr3;

public class AutomaticMachine {
    private static AutomaticMachine instance;
    public static AutomaticMachine getInstance() {
        if(instance == null){
            instance = new AutomaticMachine();
        }
        return instance;
    }
    private AutomaticMachine(){
        //private constructor for singleton pattern
    }

}

