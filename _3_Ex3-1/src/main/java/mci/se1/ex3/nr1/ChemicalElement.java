package mci.se1.ex3.nr1;

public class ChemicalElement {
    private String name;
    private String symbol;

    private int atomicNumber;

    /**
     * implement Builder Pattern tbd!
     */
    public ChemicalElement(String name, String symbol, int atomicNumber){
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    /**
     * getter
     * @return atmoicNumber
     */
    public int getAtomicNumber() {
        return atomicNumber;
    }


    /**
     * getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getter
     * @return
     */
    public String getSymbol() {
        return symbol;
    }
}
