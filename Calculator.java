import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = scnr.nextDouble();
        System.out.println("Enter next number:");
        num2 = scnr.nextDouble();
        result = num1 + num2;
        System.out.println("Result: " + result);
        System.out.println("All done!");
        scnr.close();
    }
}