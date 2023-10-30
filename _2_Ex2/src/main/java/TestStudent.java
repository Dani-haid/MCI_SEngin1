//package edu.mci.sweng1.week1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Test the student Class.
 * Note that CPR numbers are missing or only partially filled in, since CPR
 * numbers are hard to come by (and sensitive, in any case).
 * @author andrea
 */
public class TestStudent {

    /**
     * If "static" is removed the class is not runnable.
     * One can only execute methods directly on a class if the method is static,
     * and the JVM's execution entry point is on the class itself, as no objects
     * have been created yet.
     * The name "main" is the JVM's execution entry point in a particular class.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Assignment 1, Exercise 2
        Student[] students = {
          new Student("Ib One", 1, 9, "123456-0000", Student.Gender.Male),
          new Student("Lisa Two", 1, 2, Student.Gender.Female),
          new Student("Ole Threee", 2, 2, Student.Gender.Male),
          new Student("Leo Four", 2, 3, Student.Gender.Male),
          new Student("Pia Five", 3, 5, Student.Gender.Female),
        };

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

        Student testStudent = new Student("Ib One", 1, 9, null, Student.Gender.Male);
        if (students[0].equals(testStudent))
            System.out.println(students[0] + "\nis equal to\n" + testStudent + " which is actually wrong!");
        else System.out.println(students[0] + "\nis not equal to\n" + testStudent);

        testStudent = new Student("Ib One", 1, 9, "123456-0000", Student.Gender.Male);
        if (students[0].equals(testStudent))
            System.out.println(students[0] + "\nis equal to\n" + testStudent);
        else System.out.println(students[0] + "\nis not equal to\n" + testStudent + " which is actually wrong!");

        testStudent = new Student("Ib One", 1, 9, "123456-0000", Student.Gender.Female);
        if (students[0].equals(testStudent))
            System.out.println(students[0] + "\nis equal to\n" + testStudent + " which is actually wrong!");
        else System.out.println(students[0] + "\nis not equal to\n" + testStudent);

  
        StudentCollection studentCollection = new StudentCollection(students);
        studentCollection.studentsWithProficiency(5);

        Student[] studentMatches = studentCollection.studentsWithProficiencyArray(5);
        System.out.println();
        
        testStudent = new Student("Ib One", 1, 9, "123456-0000", Student.Gender.Male);
        testStudent.getCourseGrades().add(new CourseGrade(CourseGrade.Course.GPN, 12));
        testStudent.getCourseGrades().add(new CourseGrade(CourseGrade.Course.OOP, 7));

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

 
        // Generate javadoc: Run -> Generate Javadoc.
        // The Javadoc has been placed in the "dist/javadoc" directory        
        System.out.println("Done!");
    }


}