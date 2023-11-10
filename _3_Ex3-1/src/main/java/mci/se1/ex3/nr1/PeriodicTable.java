package mci.se1.ex3.nr1;

public class PeriodicTable {
    // periodical Table has a fixed number of entries (118) --> so i choose an array
    // index of element is atomicNumber - 1
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

    public void addToTable(ChemicalElement element) throws ElementAlreadyExistsException {
        int index = (element.getAtomicNumber())-1;
        if (elementList[index] != null && elementList[index].getAtomicNumber() != 0) {
            //System.out.println("Element already exists");
            throw new ElementAlreadyExistsException("Error, this element already exists in periodic table.");
        } else {
            //element is added to List at index atomicNumber -1 (cause 0 indexed array)
            elementList[index] = element;
        }
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
     * @param atomicNumber from element which should be printed
     */
    public void printElementAtIndex(int atomicNumber){
        int index = atomicNumber-1;
        System.out.println("Trying to print Element with atomic number "  + atomicNumber);
        if(elementList[index] == null || elementList[index].getAtomicNumber()== 0){
            //exception tbd
            System.out.println("Element couldn't be printed");
        }else{
            System.out.println("Atomic Number:" + elementList[index].getAtomicNumber()
                    + " Symbol:" + elementList[index].getSymbol() + " Name:" + elementList[index].getName());
        }
    }


}
