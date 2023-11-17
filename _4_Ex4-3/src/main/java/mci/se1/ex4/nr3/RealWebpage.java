package mci.se1.ex4.nr3;

public class RealWebpage extends Webpage {
    String url;

    public RealWebpage(String url){
        this.url = url;
    }
    @Override
    public void render() {
        System.out.println("Website " + url + " will be visited.");
    }
}
