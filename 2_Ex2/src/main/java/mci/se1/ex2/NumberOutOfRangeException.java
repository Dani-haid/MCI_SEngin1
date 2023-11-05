package mci.se1.ex2;


/**
 * Exception if number is out of a special Range
 * used if number of students to Display is bigger than the size of the array or smaller than 1
 */
public class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException() {
        //System.out.println("NumberOutOfRangeException executed.");
    }
}
