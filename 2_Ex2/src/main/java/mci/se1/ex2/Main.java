package mci.se1.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exercise9 testex9 = new Exercise9();

        TestStudent testStudent = new TestStudent();

        TAStudent taStudent = new TAStudent("Assistant", 3, 5, 6, Student.Gender.male);
        taStudent.setSupportTask(new Course(Course.CourseName.GPN), "very important Task");
        taStudent.printSupportTasks();

        try{
            testex9.enterTwoNumbers(scanner);
            Student[] students = testStudent.createStudentArray(scanner);

            /* static array for debugging
            Student[] students = {
                    new Student("Student 1", 1, 9, 1, Student.Gender.male),
                    new Student("Student  2", 2, 9, 2, Student.Gender.male),
                    new Student("Student  3", 2, 9, 4, Student.Gender.female),
                    new Student("Sudent  4", 4, 9, 5, Student.Gender.male),
                    new Student("Student  5", 5, 9, 6, Student.Gender.female),
                    new Student("Student  6", 1, 9, 7, Student.Gender.unknown),
            };
            */

            //testStudent.printStudentArray(students);
            testStudent.nrObjsToDisplay(students, scanner);

        }
        finally{
            scanner.close();
            System.out.println("Done!");
        }
    }
}