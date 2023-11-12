package mci.se1.ex3.nr3.builder.drink;

public class EspressoBuilder implements DrinkBuilder {
    private  boolean cream;
    private  boolean milk;
    private  boolean sugar;
    private  String temperature;
    private  String size;

    public EspressoBuilder(){
        this.cream = false;
        this.milk = false;
        this.sugar = false;
        this.temperature = "hot";
        this.size = "large";
    }

    public EspressoBuilder addCream(){
        this.cream = true;
        return this;
    }
    public EspressoBuilder addMilk(){
        this.milk = true;
        return this;
    }
    public EspressoBuilder addSugar(){
        this.sugar = true;
        return this;
    }
    public EspressoBuilder setTemperature(String temperature){
        this.temperature = temperature;
        return this;
    }
    public EspressoBuilder setSize(String size){
        this.size = size;
        return this;
    }
    @Override
    public Drink build(){
        return new Espresso(cream, milk, sugar, temperature, size);
    }
}
