package mci.se1.ex2;

/*
Create a class PhDStudent to describe PhD students.
A PhD student is a student with a master degree
striving for a higher degree. They may be
assigned teaching support as well
 */

public class PhDStudent extends Student {
    private Degree currentDegree = Degree.Unknown;
    private CourseName currentDegreeIn;
    private Degree intendedDegree = Degree.Unknown;
    boolean giveTeachingSupport;

    public PhDStudent(String name, int group, int proficiencyInJava, int studentId, Gender gender, Degree currentDegree, CourseName currentDegreeIn, Degree intendedDegree, boolean teachingSupport){
        super(name, group, proficiencyInJava, studentId, gender);
        if(currentDegree == Degree.Master){
            this.currentDegree = currentDegree;
            this.currentDegreeIn =currentDegreeIn;
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
        return currentDegree;
    }

    public void setActualDegree(Degree actualDegree) {
        this.currentDegree = actualDegree;
    }

    public CourseName getCurrentDegreeIn() {
        return currentDegreeIn;
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
