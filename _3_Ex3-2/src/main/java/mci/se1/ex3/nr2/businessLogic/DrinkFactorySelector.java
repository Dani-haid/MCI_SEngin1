package mci.se1.ex3.nr2.businessLogic;

import java.time.LocalTime;

public class DrinkFactorySelector {
    public static DrinkFactory selectDrinkFactory(){
        //int hour = LocalTime.now().getHour();
        // hardcoded input for dev
        int hour = 22;

        System.out.println("The clock says, it's " + hour);



        if(hour >= 6 && hour <= 15){
            // Create Coffee
            return new CoffeeCreator();
        } else if (hour >= 16 && hour <= 21) {
            // Create Tea
            return new TeaCreator();
        } else{
            // Create Water
            return new WaterCreator();
        }
    }
}
