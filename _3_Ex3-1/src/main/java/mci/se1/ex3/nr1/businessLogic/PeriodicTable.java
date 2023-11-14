package mci.se1.ex3.nr1.businessLogic;

import mci.se1.ex3.nr1.exceptions.ElementAlreadyExistsException;
import mci.se1.ex3.nr1.exceptions.NoElementFoundException;

import java.util.Map;
import java.util.TreeMap;

public class PeriodicTable {
    // storing elements in TreeMap cause of the ordering of the periodical System
    private Map<Integer, ChemicalElement> elementTable = new TreeMap<>();

    // only 1 instance of Class should be created
    private static PeriodicTable instance;
    // private Constructor for Singleton Pattern
    private PeriodicTable(){}
    public static PeriodicTable getInstance(){
        if(instance == null){
            instance = new PeriodicTable();
        }
        return instance;
    }
    public void addToTable(ChemicalElement element) throws ElementAlreadyExistsException {
        if(elementTable.put(element.getAtomicNumber(), element) != null){
            throw new ElementAlreadyExistsException("this element already exists in periodic table.");
        }
    }

    public void printAllElements(){
        if(!elementTable.isEmpty()) {
            int count = 0;
            System.out.println("Printing All existing Elements:");
            for (Map.Entry<Integer, ChemicalElement> element : elementTable.entrySet()) {
                System.out.println("Atomic Number: " + element.getKey() + ", Symbol: "
                        + element.getValue().getSymbol() + ", Name:" + element.getValue().getName());
                count++;
            }
            System.out.println(count + " elements have been printed.");
        }else{
            System.out.println("No elements in table.");
        }
    }

    /**
     *
     * @param atomicNumber from element which should be printed
     */
    public void printElementAtIndex(int atomicNumber) throws NoElementFoundException {
        System.out.println("Trying to print Element with atomic number "  + atomicNumber);
        if(elementTable.containsKey(atomicNumber)){
            System.out.println("Atomic Number:" + elementTable.get(atomicNumber).getAtomicNumber()
                    + " Symbol:" + elementTable.get(atomicNumber).getSymbol() + " Name:" + elementTable.get(atomicNumber).getName() + "\n");
        }else {
            throw new NoElementFoundException("Sorry, no Element with atomic Number " + atomicNumber + " found.");
        }
    }
}
