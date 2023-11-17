package mci.se1.ex5.nr3.template;

public class Apartment extends BuildingTemplate{
    String category = "Apartment";

    @Override
    public void buildWalls() {
        System.out.println("Step 2: Setting up Walls in " + category);
    }

    @Override
    public void setDoorsAndWindows() {
        System.out.println("Step 4: Putting in Doors and Windows in " + category);
    }
}
