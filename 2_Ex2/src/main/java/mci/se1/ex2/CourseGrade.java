package mci.se1.ex2;

/**
 * Assignment 1, Exercise 7
 * Represents a course grade. The courses themselves are just represented
 * as an enumeration in this assignment. Normally they would have their own
 * representation.
 *
 * @author andrea
 */
public class CourseGrade {

    public enum Course {
        OOP {
            public String toString() { return "Object Oriented Programming"; }
        },
        GPN {
            public String toString() { return "Introductory Programming"; }
        }
    };

    private Course course;
    private int grade;

    public CourseGrade(Course course, int grade) {
        this.course = course;
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}