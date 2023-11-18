package mci.se1.ex5.nr1.observer;

public interface NewsAgencyInterface {
    void attach(Observer ob);
    void detach(Observer ob);
    void notifyObserver(String news);
}
