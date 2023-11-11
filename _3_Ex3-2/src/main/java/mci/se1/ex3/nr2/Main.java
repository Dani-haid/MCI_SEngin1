package mci.se1.ex3.nr2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AutomaticMachine automaticMachine = null;

        Date d = new Date();
        int hour = d.getHours();

        // hardcoded input for dev
        //int hour = 2;

        if(hour >= 6 && hour <= 15){
            // Create Coffee
            automaticMachine = new CoffeeCreator();
        } else if (hour >= 16 && hour <= 21) {
            // Create Tea
            automaticMachine = new TeaCreator();
        } else{
            automaticMachine = new WaterCreator();
        }

        System.out.println("The clock says, it's " + hour);
        automaticMachine.orderDrink();
    }
}
