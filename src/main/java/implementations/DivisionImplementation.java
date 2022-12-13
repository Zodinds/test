package main.java.implementations;

import main.java.interafaces.DivisionInterface;

public class DivisionImplementation implements DivisionInterface {
    @Override
    public float divide(float a, float b) {
        return a/b;
    }
}
