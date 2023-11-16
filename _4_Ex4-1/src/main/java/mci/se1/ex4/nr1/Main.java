package mci.se1.ex4.nr1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MaskInputDecorator maskInputDecorator = new MaskInputDecorator(System.in);

        System.out.println("Please enter your name:");

        try{
            int data;
            while ((data = maskInputDecorator.read()) != '\n' &&  data != '\r') {
                System.out.print((char) data);
            }
        } catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        } finally {
            System.out.println("\nDone");
            maskInputDecorator.close();
        }
    }
}