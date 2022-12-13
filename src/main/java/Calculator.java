package main.java;

import main.java.implementations.AdditionImplementation;
import main.java.implementations.DivisionImplementation;
import main.java.implementations.MultiplicationImplementation;
import main.java.implementations.SubtractionImplementation;

public class Calculator {
    public void add(float a, float b){
        System.out.println(new AdditionImplementation().add(a, b));

    }
    public void subtract(float a, float b){
        System.out.println(new SubtractionImplementation().subtract(a, b));

    }
    public void multiply(float a, float b){
        System.out.println(new MultiplicationImplementation().multiply(a, b));
    }
    public void divide(float a, float b){
        if(b == 0){
            System.err.println("You cannot divide by 0");
            return;
        }
        System.out.println(new DivisionImplementation().divide(a, b));
    }
}
