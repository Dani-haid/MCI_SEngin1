package mci.se1.ex2;

import java.util.Scanner;


/**
 * Class to handle input from console
 * and return a Student Object with values
 * automatically Student constructor will be called
 */
public class ConsoleStudent {
    /**
     * @param scanner
     * asks user for name, group, proficiencyInJava, studentId, Gender
     * minimal validation
     * @return Student object
     */
    public static Student createStudentFromConsole(Scanner scanner){
        System.out.println("New Student will be added, please insert the following values:\n");
        System.out.println("Name of the Student: ");
        String name = scanner.nextLine();

        System.out.println("Group [0-" + Student.MAX_GROUP_NUMBER + "]: ");
        int group;
        while(true){
            String tempGroupString = scanner.nextLine();
            try{
                int tempGroup = Integer.parseInt(tempGroupString);
                if(tempGroup >= 0 && tempGroup <= Student.MAX_GROUP_NUMBER){
                    group = tempGroup;
                    break;
                } else{
                    System.out.println("Please insert a group number between 0 and " + Student.MAX_GROUP_NUMBER);
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert a group number between 0 and " + Student.MAX_GROUP_NUMBER);
            }
        }

        System.out.println("Proficiency in Java [1-10]: ");
        int proficiencyInJava;
        while(true){
            String tempProficencyString = scanner.nextLine();
            try{
                int tempProficency = Integer.parseInt(tempProficencyString);
                if(tempProficency >= 1 && tempProficency <= 10){
                    proficiencyInJava = tempProficency;
                    break;
                } else{
                    System.out.println("Please insert a proficency value between 1 and 10.");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert a proficency value between 1 and 10.");
            }
        }

        System.out.println("Student Id: ");
        int studentId;
        while(true){
            String tempStudentIdString = scanner.nextLine();
            try{
                int tempStudentId = Integer.parseInt(tempStudentIdString);
                if(tempStudentId > 0){
                    studentId = tempStudentId;
                    break;
                } else{
                    System.out.println("Please insert a StudentId > 0.");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert a StudentId > 0.");
            }
        }

        System.out.println("Gender [Female | Male | Diverse | Unknown]: ");
        String tempGender = scanner.nextLine();

        Gender gender;
        try {
            gender = Gender.valueOf(tempGender.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender input. Setting to Unknown.");
            gender = Gender.UNKNOWN;
        }
        return new Student(name, group, proficiencyInJava, studentId, gender);
    }
}
