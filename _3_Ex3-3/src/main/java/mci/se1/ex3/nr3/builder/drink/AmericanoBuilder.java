package mci.se1.ex3.nr3.builder.drink;

public class AmericanoBuilder implements DrinkBuilder{
    private boolean cream;
    private boolean milk;
    private boolean sugar;
    private String temperature;
    private String size;

    public AmericanoBuilder(){
        this.cream = false;
        this.milk = false;
        this.sugar = false;
        this.temperature = "hot";
        this.size = "small";
    }
    public AmericanoBuilder cream(){
        this.cream = true;
        return this;
    }
    public AmericanoBuilder milk(){
        this.milk = true;
        return this;
    }
    public AmericanoBuilder sugar(){
        this.sugar = true;
        return this;
    }
    public AmericanoBuilder temperature(String temperature){
        this.temperature = temperature;
        return this;
    }

    public AmericanoBuilder size(String size){
        this.size = size;
        return this;
    }
    @Override
    public Drink build(){
        return new Americano(cream, milk, sugar, temperature, size);
    }
}
