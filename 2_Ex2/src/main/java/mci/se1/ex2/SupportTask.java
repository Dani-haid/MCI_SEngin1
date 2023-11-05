package mci.se1.ex2;

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
