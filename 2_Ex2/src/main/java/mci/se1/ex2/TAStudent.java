package mci.se1.ex2;

import java.util.ArrayList;
import java.util.List;

/*
3.2
Extend the class Student and
create a specialized class TAStudent of
teaching assistants. A teaching assistant is a student
who is assigned some support tasks in one or more courses
 */

public class TAStudent extends Student {
    private List<SupportTask> supportTasks = new ArrayList<SupportTask>();

    //constructor calling super()
    public TAStudent(String name, int group, int proficiencyInJava, int studentId, Gender gender){
        super(name, group, proficiencyInJava, studentId, gender);
        //System.out.println("constructor TAStudent");
    }

    @Override
    protected void printNewStudent(){
        super.printNewStudent();
        System.out.println("New TAStudent created.");
    }

    public void printSupportTasks(){
        for(SupportTask t : supportTasks){
            t.printTask();
        }
    }

    public void setSupportTask(CourseGrade.Course course, String taskDescription) {
        supportTasks.add(new SupportTask(course, taskDescription));
    }

}
