package mci.se1.ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Test the student Class.

 */
public class TestStudent {

    public static void main(String[] args) {
        // Assignment 1, Exercise 2
        // array with Student Objects
        Student[] students = {
                new Student("Ib One", 1, 9, 1, Student.Gender.Male),
                new Student("Lisa Two", 1, 2, Student.Gender.Female),
                new Student("Ole Threee", 2, 2, Student.Gender.Male),
                new Student("Leo Four", 2, 3, Student.Gender.Male),
                new Student("Pia Five", 3, 5, Student.Gender.Female),
        };

        /*
        if (students[3].hasSameFluencyInJavaAs(students[4]))
            System.out.println(students[3].getName() + " has same proficiency as " +
                    students[4].getName() + " which is actually wrong!");
        else System.out.println(students[3].getName() + " does not have same proficiency as " +
                students[4].getName());

        if (students[1].hasSameFluencyInJavaAs(students[2]))
            System.out.println(students[1].getName() + " has same proficiency as " +
                    students[2].getName());
        else System.out.println(students[1].getName() + " does not have same proficiency as " +
                students[2].getName() + " which is actually wrong!");

        */

        /*
        Student testStudent = new Student("Ib One", 1, 9, 4, Student.Gender.Male);
        if (students[0].equals(testStudent))
            System.out.println(students[0] + "\nis equal to\n" + testStudent + " which is actually wrong!");
        else System.out.println(students[0] + "\nis not equal to\n" + testStudent);

        testStudent = new Student("Ib One", 1, 9, 5, Student.Gender.Male);
        if (students[0].equals(testStudent))
            System.out.println(students[0] + "\nis equal to\n" + testStudent);
        else System.out.println(students[0] + "\nis not equal to\n" + testStudent + " which is actually wrong!");

        testStudent = new Student("Ib One", 1, 9, 7, Student.Gender.Female);
        if (students[0].equals(testStudent))
            System.out.println(students[0] + "\nis equal to\n" + testStudent + " which is actually wrong!");
        else System.out.println(students[0] + "\nis not equal to\n" + testStudent);

        */



        Student testStudent = new Student("Ib One", 1, 9, 8, Student.Gender.Male);
        testStudent.getCourseGrades().add(new CourseGrade(CourseGrade.Course.GPN, 12));
        testStudent.getCourseGrades().add(new CourseGrade(CourseGrade.Course.OOP, 7));

        TAStudent tatest = new TAStudent("Testoo", 3, 7, 11, Student.Gender.Female);
        tatest.setSupportTask(CourseGrade.Course.OOP, "to be done: testTask Description!");
        tatest.setSupportTask(CourseGrade.Course.GPN, "urgent: take a coffee!");

        tatest.printSupportTasks();

        PhDStudent phdTest = new PhDStudent("Phd Student", 4, 9, 22, Student.Gender.Male, Student.Degree.Master, Student.Degree.Doctor, false);

/*
        try {
            testStudent = (Student)students[0].clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        if (testStudent != students[0])
            System.out.println("Comparing references thus the result should be different! And it is so!");

        try {
            Student myCloneStudent = (Student) students[0].clone();
            if (testStudent != myCloneStudent)
                System.out.println("Comparing clones' references thus the result should be different! And it is so!");
            if (myCloneStudent.equals(students[0]))
                System.out.println("Clone should equals() a cloned object! And so it is!");
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

        */


        // Generate javadoc: Run -> Generate Javadoc.
        // The Javadoc has been placed in the "dist/javadoc" directory
        System.out.println("Done!");
    }
}