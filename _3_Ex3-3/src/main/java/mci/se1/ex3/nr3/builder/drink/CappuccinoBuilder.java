package mci.se1.ex3.nr3.builder.drink;

public class CappuccinoBuilder implements DrinkBuilder{
    private boolean cream;
    private boolean milk;
    private boolean sugar;
    private String temperature;
    private String size;

    public CappuccinoBuilder(){
        this.cream = false;
        this.milk = false;
        this.sugar = false;
        this.temperature = "warm"; //Enum tbd
        this.size = "medium";
    }

    public CappuccinoBuilder addCream(){
        this.cream = true;
        return this;
    }

    public CappuccinoBuilder addMilk(){
        this.milk = true;
        return this;
    }

    public CappuccinoBuilder addSugar(){
        this.sugar = true;
        return this;
    }

    public CappuccinoBuilder setTemperature(String temperature){
        this.temperature = temperature;
        return this;
    }

    public CappuccinoBuilder setSize(String size){
        this.size = size;
        return this;
    }

    @Override
    public Drink build(){
        return new Cappuccino(cream, milk, sugar, temperature, size);
    }
}
