package main.java.implementations;

import main.java.interafaces.MultiplicationInterface;

public class MultiplicationImplementation implements MultiplicationInterface {
    @Override
    public float multiply(float a, float b) {
        return a*b;
    }
}
