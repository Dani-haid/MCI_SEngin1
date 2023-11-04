package mci.se1.ex2;

/*
Create a class PhDStudent to describe PhD students.
A PhD student is a student with a master degree
striving for a higher degree. They may be
assigned teaching support as well
 */

public class PhDStudent extends Student {
    private Degree actualDegree = Degree.Unknown;
    private Degree intendedDegree = Degree.Unknown;
    boolean giveTeachingSupport;

    public PhDStudent(String name, int group, int proficiencyInJava, int studentId, Gender gender, Degree actualDegree, Degree intendedDegree, boolean teachingSupport){
        super(name, group, proficiencyInJava, studentId, gender);
        //System.out.println("constructor PhDStudent");
        if(actualDegree == Degree.Master){
            this.actualDegree = actualDegree;
            this.intendedDegree = intendedDegree;
            this.giveTeachingSupport = teachingSupport;
        }else{
            System.out.println("PhD Student needs to have a master degree.");
        }
    }

    @Override
    protected void printNewStudent(){
        super.printNewStudent();
        System.out.println("New PhdStudent created.");
    }

    public Degree getActualDegree() {
        return actualDegree;
    }

    public void setActualDegree(Degree actualDegree) {
        this.actualDegree = actualDegree;
    }

    public Degree getIntendedDegree() {
        return intendedDegree;
    }

    public void setIntendedDegree(Degree intendedDegree) {
        this.intendedDegree = intendedDegree;
    }

    public boolean isGiveTeachingSupport() {
        return giveTeachingSupport;
    }

    public void setGiveTeachingSupport(boolean giveTeachingSupport) {
        this.giveTeachingSupport = giveTeachingSupport;
    }

}
