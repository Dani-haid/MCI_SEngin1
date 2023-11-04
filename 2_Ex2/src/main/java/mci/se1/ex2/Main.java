package mci.se1.ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TestStudent testStudent = new TestStudent();
        Scanner scanner = new Scanner(System.in);
        try{
            //Student[] students = testStudent.createStudentArray(scanner);
            Student[] students = {
                    new Student("Student 1", 1, 9, 1, Student.Gender.male),
                    new Student("Student  2", 2, 9, 2, Student.Gender.male),
                    new Student("Student  3", 2, 9, 4, Student.Gender.female),
                    new Student("Sudent  4", 4, 9, 5, Student.Gender.male),
                    new Student("Student  5", 5, 9, 6, Student.Gender.female),
                    new Student("Student  6", 1, 9, 7, Student.Gender.unknown),
            };
            //testStudent.printStudentArray(students);
            testStudent.nrObjsToDisplay(students, scanner);

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
        }
        finally{
            scanner.close();
            System.out.println("Done!");
        }
    }
}