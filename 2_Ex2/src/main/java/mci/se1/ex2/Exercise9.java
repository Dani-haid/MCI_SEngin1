package mci.se1.ex2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise9 {
    public void enterTwoNumbers(Scanner scanner){
        int a, b;
        System.out.println("Please enter two integer numbers [a] and [b]:");

        while(true){
            try{
                System.out.println("[a]:");
                String aTemp = scanner.nextLine();
                a = Integer.parseInt(aTemp);
                System.out.println("[b]:");
                String bTemp = scanner.nextLine();
                b = Integer.parseInt(bTemp);
                if(b == 0){
                    throw new ArithmeticException();
                }
                System.out.println("Thanks, the Input was: a=" + a + " b=" + b);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert an integer value.");
            }
            catch (ArithmeticException e){
                System.out.println("Invalid input. Value [b] shouldn't be 0.");
            }
        }
    }
}
