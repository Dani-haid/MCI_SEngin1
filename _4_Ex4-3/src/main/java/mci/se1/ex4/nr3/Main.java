package mci.se1.ex4.nr3;

/**
 * Entwerfen und implementieren Sie eine Java-Anwendung, die die
 * Verbindung zum Web simuliert und als eine Art Webbrowser
 * zur Kindersicherung fungiert. Bei der Eingabe einer URL
 * sollte die Webseite nicht sofort gerendert werden, sondern
 * zunächst einen Filter durchlaufen, um zu prüfen, ob es sich um eine erlaubte Seite handelt
 * oder nicht, z.B. basierend auf einer Liste (sog. Blacklist) von URLs und/oder IP-Adressen.
 */
public class Main {
    public static void main(String[] args) {
        ParentControlProxy.addToBlacklist("www.myurlonblacklist.com");
        ParentControlProxy.addToBlacklist("www.mci4me.at");
        ParentControlProxy.addToBlacklist("www.coffeeclub.de");
        ParentControlProxy.addToBlacklist("www.havefun.com");

        Webpage whitelistsite = new ParentControlProxy("www.test1.com");
        whitelistsite.render();

        Webpage blacklistsite = new ParentControlProxy("www.coffeeclub.de");
        blacklistsite.render();
    }
}