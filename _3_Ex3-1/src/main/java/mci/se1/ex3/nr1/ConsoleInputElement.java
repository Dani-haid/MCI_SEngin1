package mci.se1.ex3.nr1;

import java.util.Scanner;

public class ConsoleInputElement {
    public static int checkInputSize(){
        int inputElements = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements would you like to input?");

        while (true) {
            String tempinputElementsStr = scanner.nextLine();
            try {
                inputElements = Integer.parseInt(tempinputElementsStr);
                if (inputElements >= 1 && inputElements <= 118) {
                    break;
                } else {
                    System.out.println("Please insert a number between 1 and 118.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please insert an integer between 0 and 118.");
            }
        }
        return inputElements;
    }
    public static ChemicalElement addNewInputElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new chemical element.");
        System.out.println("atomic Number: ");
        int atomicNumber;
        while (true) {
            String tempNumberString = scanner.nextLine();
            try {
                int tempNumber = Integer.parseInt(tempNumberString);
                if (tempNumber >= 1 && tempNumber <= 118) {
                    atomicNumber = tempNumber;
                    break;
                } else {
                    System.out.println("Please insert an atomic number between 1 and 118.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please insert an integer between 0 and 118.");
            }
        }
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Symbol: ");
        String symbol = scanner.nextLine();

        return new ChemicalElement(name, symbol, atomicNumber);
    }
}
