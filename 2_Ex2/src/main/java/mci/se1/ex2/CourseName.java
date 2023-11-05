package mci.se1.ex2;

/**
 * enum with CourseNames
 * referenced in CourseGrade and SupportTask
 */
public enum CourseName {
    APN("Advanced Programming"),
    FED("Frontend Developing"),
    GPN("Introductory Programming"),
    OOP("Object Oriented Programming");
    private String courseName;

    CourseName(String inputCourseName) {
        this.courseName = inputCourseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
