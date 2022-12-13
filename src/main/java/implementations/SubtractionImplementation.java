package main.java.implementations;

import main.java.interafaces.SubtractionInterface;

public class SubtractionImplementation implements SubtractionInterface {
    @Override
    public float subtract(float a, float b) {
        return a-b;
    }
}
