package mci.se1.ex6.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    // Calculator to be tested
    Calculator calculator;

    // Setup for each test
    @BeforeEach
    void BeforeEach() {
        calculator = new Calculator();
        calculator.switchOn();
    }

    // Teardown for each test
    @AfterEach
    void AfterEach() {
        calculator.switchOff();
    }

    //a. Test if calculator is on after switchOn()
    @Test
    void testSwitchedOn(){
        calculator.switchOn();
        assertTrue(calculator.isOn(),"failure, calculator is off but should be on.");
    }

    //b. Test if calculator is off before switchOff()
    @Test
    void testSwitchedOff(){
        calculator.switchOff();
        assertFalse(calculator.isOn(), "failure, calculator is on but should be off.");
    }

    //c. Test if calculator can add, multiply, divide and Subtract
    // testing adding two numbers
    @Test
    void testAddition(){
        assertEquals(30, calculator.calc("5", "25", '+'),
                "failure, 5 + 25 should return 30.");
    }

    // testing subtracting two numbers
    @Test
    void testSubtract(){
        assertEquals(10, calculator.calc("20", "10", '-'),
                "failure, 20 + 10 should return 10.");
    }

    // testing subtracting two numbers
    @Test
    void testMultiply(){
        assertEquals(6, calculator.calc("2", "3", '*'),
                "failure, 2 + 3 should return 6.");
    }

    // testing subtracting two numbers
    @Test
    void testDivide(){
        assertEquals(5, calculator.calc("10", "2", '/'),
                "failure, 10 + 2 should return 5.");
    }

    //d. Test if calculator can throw an exception if divided by 0
    @Test
    void testDivisionbyZero(){
        assertThrows(ArithmeticException.class,
                () -> calculator.calc("1", "0", '/'),
                "failure there should be an Arithmetic Exception when dividing by zero.");
    }

    //e. Test if calculator throw an exception, if an argument is out
    //of bounds? (input < -1000) (Test minimum and maximum
    //range for input parameters)
    @Test
    void testOutOfBoundMinFirst(){
        assertThrows(IllegalArgumentException.class,
                ()-> calculator.calc("-1001", "5", '+'),
                "failure argument must throw IllegalArgumentException if it's smaller than -1000.");
    }

    @Test
    void testOutOfBoundMaxFirst(){
        assertThrows(IllegalArgumentException.class,
                ()-> calculator.calc("1001", "5", '+'),
                "failure argument must throw IllegalArgumentException if it's larger than 1000.");
    }

    @Test
    void testOutOfBoundMinSecond(){
        assertThrows(IllegalArgumentException.class,
                ()-> calculator.calc("5", "-1001", '+'),
                "failure argument must throw IllegalArgumentException if it's smaller than -1000.");
    }

    @Test
    void testOutOfBoundMaxSecond(){
        assertThrows(IllegalArgumentException.class,
                ()-> calculator.calc("5", "1001", '+'),
                "failure argument must throw IllegalArgumentException if it's larger than 1000.");
    }


}
