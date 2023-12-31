package mci.se1.ex3.nr1.businessLogic;

import java.util.Scanner;
public class ConsoleHelper {
    private Scanner scanner;

    public ConsoleHelper(){
        this.scanner = new Scanner(System.in);
    }
    public int consoleDecision(){
        // options could be written as enum in next version
        System.out.println("What would you like to do? enter new elements[1] | print one element[2] | print all elements[3] | exit program[4]");
        int whatsNext;

        while (true) {
            String tempDecisionStr = this.scanner.nextLine();
            try {
                whatsNext = Integer.parseInt(tempDecisionStr);
                if (whatsNext >= 1 && whatsNext <= 4) {
                    break;
                } else {
                    System.out.println("Please choose [1], [2], [3] or [4].");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please insert valid decision number.");
            }
        }
        return whatsNext;
    }
    public int checkInputSize(){
        int inputElements;
        System.out.println("How many elements would you like to input?");

        while (true) {
            String tempinputElementsStr = this.scanner.nextLine();
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
    public ChemicalElement addNewInputElement() {
        System.out.println("Adding a new chemical element.");
        System.out.println("atomic Number: ");
        int atomicNumber;
        while (true) {
            String tempNumberString = this.scanner.nextLine();
            try {
                int tempNumber = Integer.parseInt(tempNumberString);
                if (tempNumber >= 1 && tempNumber <= 118) {
                    atomicNumber = tempNumber;
                    break;
                } else {
                    System.out.println("Please insert an atomic number between 1 and 118.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please insert an integer between 1 and 118.");
            }
        }
        System.out.println("Name: ");
        String name = this.scanner.nextLine();

        System.out.println("Symbol: ");
        String symbol = this.scanner.nextLine();

        return new ChemicalElement(name, symbol, atomicNumber);
    }

    public int checkPrintElement(){
        int printElement;
        System.out.println("Atomic number of element, which should be printed:");

        while (true) {
            String printElementStr = this.scanner.nextLine();
            try {
                printElement = Integer.parseInt(printElementStr);
                if (printElement >= 1 && printElement <= 118) {
                    break;
                } else {
                    System.out.println("Please insert a number between 1 and 118.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please insert an integer between 1 and 118.");
            }
        }
        return printElement;
    }

    public void shutdown(){
        this.scanner.close();
    }
}
