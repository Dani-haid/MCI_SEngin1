package mci.se1.ex4.nr2.businessLogic;

import java.util.ArrayList;
import java.util.List;

public class StaffDirectory extends AbstractStaff{
    private List<AbstractStaff> compositeStaff = new ArrayList<>();

    public void addStaff(AbstractStaff staff, String msg){
        System.out.println("added " + msg);
        compositeStaff.add(staff);
    }

    public void remove(AbstractStaff staff, String msg){
        System.out.println("removed " + msg);
        compositeStaff.remove(staff);
    }
    @Override
    public void print() {
        for (AbstractStaff staffElement:compositeStaff) {
            staffElement.print();
        }

    }
}
