package mci.se1.ex2;

import java.util.Scanner;

public class TestStudent {
    public static final int MAX_STUDENT_NUMBER = 20;
    public Student[] createStudentArray(Scanner scanner){
        // asking user how many students should be created
        int nrStud;
        System.out.println("How many Students would you like to create?");

        //Scanner scanner = new Scanner(System.in);

        while(true){
            String nrStudString = scanner.nextLine();
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
            myStudents[i] = new Student(scanner);
        }
        System.out.println("\n");
        return myStudents;
    }

    public void printStudentArray(Student[] myStudents){
        // printing out generated students
        for (Student element : myStudents){
            System.out.print(element.toString());
            System.out.println("\n");
        }
    }
    public void nrObjsToDisplay(Student[] myStudents, Scanner scanner){
        int studentArraySize = myStudents.length;
        //Scanner scanner = new Scanner(System.in);

        while(true){
            // asking about number of students to display
            System.out.println("How many Students would you like to display?");
            String noDisplayString = scanner.nextLine();
            try{
                int studentsToDisplay = Integer.parseInt(noDisplayString);
                if(studentsToDisplay < 1 || studentsToDisplay > studentArraySize){
                    throw new NumberOutOfRangeException();
                }else{
                    // printing desired number of Students
                    for (int i = 0; i < studentsToDisplay; i++){
                        System.out.println(myStudents[i].toString());
                    }
                    break;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert an integer value between 1 and " + studentArraySize);
            }
            catch (NumberOutOfRangeException e){
                System.out.println("NumberOutOfRangeException: Invalid Input --> Please insert a value between 1 and " + studentArraySize);
            }
        }
    }

}
