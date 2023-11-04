package mci.se1.ex2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestStudent {
    public static final int MAX_STUDENT_NUMBER = 20;
    public static void main(String[] args) {
        // Assignment 1, Exercise 2
        // array with Student Objects
        /*
        Student[] students = {
                new Student("Ib One", 1, 9, 1, Student.Gender.male),
                new Student("Lisa Two", 1, 2, Student.Gender.female),
                new Student("Ole Threee", 2, 2, Student.Gender.male),
                new Student("Leo Four", 2, 3, Student.Gender.male),
                new Student("Pia Five", 3, 5, Student.Gender.female),
        };
        */

        // asking user about how many students for array
        int nrStud;
        System.out.println("How many Students would you like to create?");

        Scanner scanner1 = new Scanner(System.in);
        while(true){
            String nrStudString = scanner1.nextLine();
            try{
                int nrStudTemp = Integer.parseInt(nrStudString);
                if(nrStudTemp >= 1 && nrStudTemp <= MAX_STUDENT_NUMBER){
                    nrStud = nrStudTemp;
                    break;
                }else{
                    System.out.println("Please insert a value between 1 and " + MAX_STUDENT_NUMBER);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert an integer value between 1 and " + MAX_STUDENT_NUMBER);
            }
        }
        //scanner1.close();

        // creating Student array
        Student[] myStudents = new Student[nrStud];
        /*
        for (Student element : myStudents){
            System.out.print(element + " ");
        }
        System.out.println("\n");
        */
        // filling up array with Student information
        for (int i = 0; i < myStudents.length; i++){
            myStudents[i] = new Student(scanner1);
        }
        System.out.println("\n");

        // printing out generated students
        for (Student element : myStudents){
            System.out.print(element.toString());
            System.out.println("\n");
        }
        System.out.println("\n");


        //

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
        scanner1.close();



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