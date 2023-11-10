package mci.se1.ex3.nr1;

public class PeriodicTable {
    // periodical Table has a fixed number of entries (118) --> so i choose an array
    // only problem is index 0
    ChemicalElement[] elementList = new ChemicalElement[118];

    // only 1 instance of Class should be created
    private static PeriodicTable instance;

    // private Constructor for Singleton Pattern
    private PeriodicTable(){

    }
    public static PeriodicTable getInstance(){
        if(instance == null){
            instance = new PeriodicTable();
        }
        return instance;
    }

    public void addToTable(ChemicalElement element){
        /*
         * exception handling tbd
         */
        elementList[element.getAtomicNumber()] = element;
    }

    public void printAllElements(){
        System.out.println("Printing All existing Elements:\n");
        for (ChemicalElement element : elementList) {
            if(element != null && element.getAtomicNumber()!= 0){
                System.out.println("Atomic Number:" + element.getAtomicNumber()
                        + " Symbol:" + element.getSymbol() + " Name:" + element.getName());
            }
        }
    }


    /**
     *
     * @param index from element which should be printed
     */
    public void printElementAtIndex(int index){
        System.out.println("Trying to print Element with atomic number "  + index);
        if(elementList[index] == null || elementList[index].getAtomicNumber()== 0){
            //exception tbd
            System.out.println("Element couldn't be printed");
        }else{
            System.out.println("Atomic Number:" + elementList[index].getAtomicNumber()
                    + " Symbol:" + elementList[index].getSymbol() + " Name:" + elementList[index].getName());
        }
    }


}
