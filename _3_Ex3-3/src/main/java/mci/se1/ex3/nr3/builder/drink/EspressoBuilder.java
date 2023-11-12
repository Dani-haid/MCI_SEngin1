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

    public EspressoBuilder cream(){
        this.cream = true;
        return this;
    }
    public EspressoBuilder milk(){
        this.milk = true;
        return this;
    }
    public EspressoBuilder sugar(){
        this.sugar = true;
        return this;
    }
    public EspressoBuilder temperature(String temperature){
        this.temperature = temperature;
        return this;
    }
    public EspressoBuilder size(String size){
        this.size = size;
        return this;
    }
    @Override
    public Drink build(){
        return new Espresso(cream, milk, sugar, temperature, size);
    }
}
