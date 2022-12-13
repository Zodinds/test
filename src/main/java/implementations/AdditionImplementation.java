package main.java.implementations;

import main.java.interafaces.AdditionInterface;

public class AdditionImplementation implements AdditionInterface {
    @Override
    public float add(float a, float b) {
        return a+b;
    }
}
