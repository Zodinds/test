package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello user");
        Scanner input = new Scanner(System.in);
        float a;
        float b;
        String action;

        System.out.println("Enter first number:");
        while(true) {
            try {
                a = input.nextFloat();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Your input should be a number. Please try again");
                input.nextLine();
            }
        }

        System.out.println("Enter second number:");
        while(true) {
            try {
                b = input.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Your input should be a number. Please try again");
                input.nextLine();
            }
        }

        System.out.println("Enter action:");
        while(true) {
            try {
                action = input.nextLine();
                if(!action.equals("+") && !action.equals("-") && !action.equals("*") && !action.equals("/"))
                    throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Your input should be one of these: +,-,*,/ . Please try again");
            }
        }

        Calculator calculator = new Calculator();
        switch (action){
            case "+":
                calculator.add(a,b);
                break;
            case "-":
                calculator.subtract(a, b);
                break;
            case "*":
                calculator.multiply(a, b);
                break;
            case "/":
                calculator.divide(a, b);
        }
    }
}
