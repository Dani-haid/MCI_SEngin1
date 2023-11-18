package mci.se1.ex5.nr1.observer;

public class NewsSite extends Observer {
    @Override
    public void update() {
        System.out.println("News Website: there are news for you.");
    }
}
