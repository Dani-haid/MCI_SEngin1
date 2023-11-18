package mci.se1.ex6.calculator;

public class Calculator {

    private boolean on;

    public Calculator() {
        on= false;
    }

    /**
     * Switch calculator on
     * @throws IllegalStateException
     */
    public void switchOn() throws IllegalStateException {
        on= true;
        System.out.println("*Calculator on*");
    }


    /**
     * Switch calculator off
     * @throws IllegalStateException
     */
    public void switchOff() throws IllegalStateException {
        on= false;
        System.out.println("*Calculator off*");
    }

    /**
     * Query calculator state
     * @return true if calculator is on, else false
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Perform mathematical operation on two arguments and return result
     *
     * @param x  First argument, real number as string, valid range: -1000 <= x <= 1000
     * @param y  Second argument, real number as string, valid range: -1000 <= x <= 1000
     * @param op Operator, valid operators: '+','-','*','/'
     * @return x op y
     * @throws IllegalStateException    In case of this method being used in an illegal calculator state
     * @throws IllegalArgumentException In case of illegal arguments x, y
     * @throws ArithmeticException      In case of an arithmetic exception, i.e. division by zero
     */
    public double calc(String x, String y, char op) throws IllegalArgumentException, IllegalStateException, ArithmeticException
    {
        if (op != '+' && op != '-' && op != '*' && op != '/')
            throw new IllegalArgumentException("Illegal operator: " + op);

        if (!on)
            throw new IllegalStateException("Calculator is off");

        double a, b;
        try {
            a = Double.parseDouble(x);
            b = Double.parseDouble(y);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Illegal argument: " + e.getMessage());
        }

        if (a < -1000 || a > 1000)
            throw new IllegalArgumentException("Illegal argument x: " + x);
        if (b < -1000 || b > 1000)
            throw new IllegalArgumentException("Illegal argument y: " + y);

        switch (op) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b == 0)
                    throw new ArithmeticException("Division by zero");
                return a/b;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Calculator c= new Calculator();
        try {
            c.switchOn();

            System.out.println( c.calc("100", "0", '/') );

            c.switchOff();
        }
        catch (IllegalStateException ise)
        {
            System.out.println("Calculator State Error: " + ise.getMessage()); }
        catch (IllegalArgumentException iae)
        {
            System.out.println("Calculator Argument Error: " + iae.getMessage()); }
        catch (ArithmeticException ae)
        {
            System.out.println("Calculator Arithmetic Error: " + ae.getMessage()); }
    }
}
