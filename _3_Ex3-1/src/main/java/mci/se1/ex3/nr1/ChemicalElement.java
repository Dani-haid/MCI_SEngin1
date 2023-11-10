package mci.se1.ex3.nr1;

public class ChemicalElement {
    private String name;
    private String symbol;
    final private int atomicNumber;

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
     * @return symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param name setter
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param symbol setter
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
