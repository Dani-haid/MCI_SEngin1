package mci.se1.ex3.nr1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeriodicTable myPeriodicTable = PeriodicTable.getInstance();

        int inputElements = ConsoleInputElement.checkInputSize();

        for (int i = 0; i < inputElements; i++){
            myPeriodicTable.addToTable(ConsoleInputElement.addNewInputElement());
        }


        myPeriodicTable.addToTable(new ChemicalElement("Wasserstoff", "H", 1));
        myPeriodicTable.addToTable(new ChemicalElement("Phosphor", "P", 15));

        myPeriodicTable.printAllElements();


    }
}
