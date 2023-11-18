package mci.se1.ex5.nr1.observer;

public class NewsSite extends Observer {
    private String name;

    public NewsSite(String name){
        this.name = name;
    }
    @Override
    public void update(String news) {
        System.out.println(name + " received the notification.");
    }
}
