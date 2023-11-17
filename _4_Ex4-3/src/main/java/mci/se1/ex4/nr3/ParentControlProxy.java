package mci.se1.ex4.nr3;

import java.util.ArrayList;
import java.util.List;

public class ParentControlProxy extends Webpage {
    private final RealWebpage website;
    public static final List<String> blacklist = new ArrayList<>();

    public ParentControlProxy(String url){
        website = new RealWebpage(url);
    }

    @Override
    public void render() {
        if (blacklist.contains(website.url)){
            System.out.println("Sorry - url " +  website.url + " is on blacklist");
        }else{
            this.website.render();
        }
    }

    public static void addToBlacklist(String url){
        blacklist.add(url);
    }
}
