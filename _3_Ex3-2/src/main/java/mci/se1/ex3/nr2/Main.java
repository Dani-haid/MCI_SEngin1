package mci.se1.ex3.nr2;

public class Main {
    public static void main(String[] args) {
        AutomaticMachine automaticMachine = new CoffeeCreator();
        automaticMachine.orderDrink();

        automaticMachine = new TeaCreator();
        automaticMachine.orderDrink();


        //DrinkFactory drinkFactory = new CoffeeFactory();
        //Drink Coffee = drinkFactory.orderDrink();

    }
}
