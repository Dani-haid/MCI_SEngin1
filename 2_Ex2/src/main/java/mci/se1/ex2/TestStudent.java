package mci.se1.ex2;

import java.util.Scanner;

public class TestStudent {
    public static final int MAX_STUDENT_NUMBER = 20;
    public Student[] createStudentArray(){
        // asking user how many students should be created
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

        // creating Student array
        Student[] myStudents = new Student[nrStud];

        // filling up array with Student information
        for (int i = 0; i < myStudents.length; i++){
            myStudents[i] = new Student(scanner1);
        }
        System.out.println("\n");

        scanner1.close();
        return myStudents;
    }

    public void printStudentArray(Student[] myStudents){
        // printing out generated students
        for (Student element : myStudents){
            System.out.print(element.toString());
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
