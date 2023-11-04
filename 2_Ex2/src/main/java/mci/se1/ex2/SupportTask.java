package mci.se1.ex2;

public class SupportTask {
    private String taskDescription;
    private Course course;

    public SupportTask(Course course, String description) {
        this.course = course;
        this.taskDescription = description;
    }

    public void printTask(){
        System.out.println("Task: " + taskDescription + " for course: "  + course);
    }
}
