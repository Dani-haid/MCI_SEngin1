package mci.se1.ex5.nr1.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsAgency implements NewsAgencyInterface {
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer ob) {
        observers.add(ob);
        System.out.println("Observer was subscribed");
    }

    @Override
    public void detach(Observer ob) {
        observers.remove(ob);
        System.out.println("Observer was unsubscribed");
    }

    @Override
    public void notifyObserver() {
        for (Observer elements:observers) {
            elements.update();
        }
    }
}
