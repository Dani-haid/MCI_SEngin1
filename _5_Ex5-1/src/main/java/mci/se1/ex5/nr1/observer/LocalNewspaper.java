package mci.se1.ex5.nr1.observer;

public class LocalNewspaper extends Observer {
    String name;

    public LocalNewspaper(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        System.out.println(name + " there are news for you.");
    }
}
