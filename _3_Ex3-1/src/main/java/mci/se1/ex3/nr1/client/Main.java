package mci.se1.ex3.nr1.client;

import mci.se1.ex3.nr1.businessLogic.ConsoleHelper;
import mci.se1.ex3.nr1.exceptions.ElementAlreadyExistsException;
import mci.se1.ex3.nr1.exceptions.NoElementFoundException;
import mci.se1.ex3.nr1.businessLogic.PeriodicTable;

public class Main {
    public static void main(String[] args) {
        PeriodicTable myPeriodicTable = PeriodicTable.getInstance();
        ConsoleHelper consoleHelper = new ConsoleHelper();
        try{
            int whatsNext;
            do{
                /**
                 * 1 - enter new elements
                 * 2 - print one element
                 * 3 - print all elements
                 * 4 - exit program
                 */
                whatsNext = consoleHelper.consoleDecision();
                switch (whatsNext) {
                    case 1:
                        // asks user about how many elements should be inserted
                        int inputElements = consoleHelper.checkInputSize();

                        // asks about data of each new element and adds it to the table
                        for (int i = 0; i < inputElements; i++){
                            try {
                                myPeriodicTable.addToTable(consoleHelper.addNewInputElement());
                            } catch (ElementAlreadyExistsException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        System.out.println("Thanks for entering new elements");
                        break;
                    case 2:
                        int printElement = consoleHelper.checkPrintElement();
                        try{
                            // prints only element with atomic number ...
                            myPeriodicTable.printElementAtIndex(printElement);
                        } catch (NoElementFoundException e){
                            System.out.println("Error: " + e.getMessage() + "\n");
                        }

                        break;
                    case 3:
                        // prints all existing elements in the table
                        myPeriodicTable.printAllElements();
                        break;
                    case 4:
                        System.out.println("Thanks. Program will be quit now");
                        break;
                    default:
                        System.out.println("There was a problem, please take a new decision");
                }
            } while (whatsNext != 4);


        }finally{
            consoleHelper.shutdown();
            System.out.println("Done!");
        }
    }
}
