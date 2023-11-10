package mci.se1.ex3.nr1;

public class Main {
    public static void main(String[] args) {
        PeriodicTable myPeriodicTable = PeriodicTable.getInstance();
        myPeriodicTable.addToTable(new ChemicalElement("Wasserstoff", "H", 1));
        myPeriodicTable.addToTable(new ChemicalElement("Phosphor", "P", 15));

        myPeriodicTable.printAllElements();


    }
}
