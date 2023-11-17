package mci.se1.ex5.nr3.template;

public abstract class BuildingTemplate {
    public final void buildHouse(){
        System.out.println("Building House");
        buildFoundation();
        buildWalls();
        placeRoof();
        setDoorsAndWindows();
    }
    private void buildFoundation(){
        System.out.println("Step1: Building foundation");
    }
    public abstract void buildWalls();

    private void placeRoof(){
        System.out.println("Step3: Putting roof on top");
    }
    public abstract void setDoorsAndWindows();
}
