package mci.se1.ex3.nr2;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        AutomaticMachine automaticMachine = AutomaticMachine.getInstance();
        DrinkFactory drinkFactory;

        int hour = LocalTime.now().getHour();
        // hardcoded input for dev
        //int hour = 22;

        if(hour >= 6 && hour <= 15){
            // Create Coffee
            drinkFactory = new CoffeeCreator();
        } else if (hour >= 16 && hour <= 21) {
            // Create Tea
            drinkFactory = new TeaCreator();
        } else{
            drinkFactory = new WaterCreator();
        }

        System.out.println("The clock says, it's " + hour);
        automaticMachine.prepare(drinkFactory.createDrink());
    }
}
