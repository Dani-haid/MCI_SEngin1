package mci.se1.ex3.nr3.builder.drink;

public class Americano implements Drink {
    private final boolean cream;
    private final boolean milk;
    private final boolean sugar;
    private final String temperature;
    private final String size;

    protected Americano(boolean cream, boolean milk, boolean sugar, String temperature, String size){
        this.cream = cream;
        this.milk = milk;
        this.sugar = sugar;
        this.temperature = temperature;
        this.size = size;
    }
    @Override
    public void prepare(){

        System.out.println("That's an Americano - enjoy.");
    }
}
