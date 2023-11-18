package mci.se1.ex5.nr1.observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteNewsAgency implements NewsAgencyInterface {
    private Set<Observer> observers;

    public ConcreteNewsAgency(){
        this.observers = new HashSet<>();
    }
    @Override
    public void attach(Observer ob) {
        if(ob == null){
            throw new NullPointerException("Error: Observer is null");
        }else if(observers.contains(ob)){
            System.out.println("Observer is already subscribed to news channel");
        }else{
            observers.add(ob);
            System.out.println("Observer was subscribed");
        }
    }

    @Override
    public void detach(Observer ob) {
        if(observers.remove(ob)){
            System.out.println("Observer was succesfully unsubscribed");
        }else{
            System.out.println("Element couldn't be found in List");
        }
    }

    @Override
    public void notifyObserver(String news) {
        System.out.println("following news will be spreaded: " + news);
        for (Observer elements:observers) {
            elements.update(news);
        }
    }
}
