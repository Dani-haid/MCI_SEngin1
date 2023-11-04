package mci.se1.ex2;

public class Course {
    public enum CourseName {
        OOP {public String toString() { return "Object Oriented Programming"; }},
        GPN {public String toString() { return "Introductory Programming"; }}
    };

    private CourseName courseName;

    public Course(CourseName course){
        this.courseName = course;
    }

    public CourseName getCourseName() {
        return courseName;
    }

    public void setCourseName(CourseName courseName) {
        this.courseName = courseName;
    }
}
