package mci.se1.ex2;

public enum CourseName {
    OOP ("Object Oriented Programming"),
    GPN ("Introductory Programming"),
    APN("Advanced Programming"),
    FED("Frontend Developing");
    private String courseName;

    CourseName(String inputCourseName){
        this.courseName = inputCourseName;
    }

    public String getCourseName(){
        return courseName;
    }
}
