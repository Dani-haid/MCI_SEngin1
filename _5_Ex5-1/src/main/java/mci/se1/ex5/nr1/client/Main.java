package mci.se1.ex5.nr1.client;

import mci.se1.ex5.nr1.observer.ConcreteNewsAgency;
import mci.se1.ex5.nr1.observer.LocalNewspaper;
import mci.se1.ex5.nr1.observer.NewsSite;
import mci.se1.ex5.nr1.observer.Observer;

/**
 * A news agency is a business that collect news,
 * prepares news stories and feature articles that
 * are then sold to other news organizations.
 * APA (Austria Presse Agentur) is one of Austria'
 * biggest news agencies. Local newspapers,
 * websites, local and national TVs, and so on can
 * register with APA and receive pre-packaged news that
 * they can use with little or no modification.
 * Your task is to simulate the relation of a news agency and its clients.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteNewsAgency apa = new ConcreteNewsAgency();

        Observer tirolerTageszeitung = new LocalNewspaper("Tiroler Tageszeitung");
        apa.attach(tirolerTageszeitung);

        String news = "Soccer news: Austria won against germany!";

        apa.notifyObserver(news);
        System.out.println("--------");

        Observer sueddeutsche = new LocalNewspaper("Sueddeutsche Zeitung");
        apa.attach(sueddeutsche);

        news = "Esspresso is getting more and more expensive";
        apa.notifyObserver(news);

        System.out.println("--------");

        Observer fazonline = new NewsSite("www.faz.de");
        apa.attach(fazonline);
        news = "There will be snow on the weekend";
        apa.notifyObserver(news);

        System.out.println("--------");

        Observer myNewspapaer = new LocalNewspaper("test");

        apa.detach(sueddeutsche);
        System.out.println("--------");
        apa.detach(myNewspapaer);
        System.out.println("--------");
        news = "Those are the final news";
        apa.notifyObserver(news);
    }
}