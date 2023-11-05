package mci.se1.ex2;

/**
 * holds courseName and grade
 */
public class CourseGrade {
    private CourseName courseName;
    private int grade;

    public CourseGrade(CourseName course, int grade) {
        this.courseName = course;
        this.grade = grade;
    }

    public CourseName getCourse() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}