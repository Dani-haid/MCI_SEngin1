package mci.se1.ex5.nr1.observer;

public class LocalNewspaper extends Observer {
    @Override
    public void update() {
        System.out.println("Local Newspaper: there are news for you.");
    }
}
