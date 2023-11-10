package mci.se1.ex3.nr1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeriodicTable myPeriodicTable = PeriodicTable.getInstance();

        int inputElements = ConsoleInputElement.checkInputSize();

        for (int i = 0; i < inputElements; i++){
            try {
                myPeriodicTable.addToTable(ConsoleInputElement.addNewInputElement());
            } catch (ElementAlreadyExistsException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        myPeriodicTable.printAllElements();
        myPeriodicTable.printElementAtIndex(8);


    }
}
