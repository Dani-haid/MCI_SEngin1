package mci.se1.ex2;

/**
 * hold a taskDescription
 * and is assigned to a course
 */
public class SupportTask {
    private String taskDescription;
    private CourseName courseName;

    public SupportTask(CourseName course, String description) {
        this.courseName = course;
        this.taskDescription = description;
    }

    public void printTask(){
        System.out.println("Task: " + taskDescription + " for course: "  + courseName);
    }
}
