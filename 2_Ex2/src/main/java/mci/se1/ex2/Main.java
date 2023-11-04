package mci.se1.ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TestStudent testStudent = new TestStudent();
        Student[] students = testStudent.createStudentArray();
        testStudent.printStudentArray(students);




/*
        Student testStudent = new Student("Ib One", 1, 9, 8, Student.Gender.male);
        testStudent.getCourseGrades().add(new CourseGrade(CourseGrade.Course.GPN, 12));
        testStudent.getCourseGrades().add(new CourseGrade(CourseGrade.Course.OOP, 7));

        TAStudent tatest = new TAStudent("Testoo", 3, 7, 11, Student.Gender.female);
        tatest.setSupportTask(CourseGrade.Course.OOP, "to be done: testTask Description!");
        tatest.setSupportTask(CourseGrade.Course.GPN, "urgent: take a coffee!");

        tatest.printSupportTasks();

        PhDStudent phdTest = new PhDStudent("Phd Student", 4, 9, 22, Student.Gender.male, Student.Degree.Master, Student.Degree.Doctor, false);
*/
/*
        Scanner scanner = new Scanner(System.in);
        Student abc = new Student(scanner);
        System.out.println(abc.toString());
        */
        //scanner1.close();


        System.out.println("Done!");
    }
}