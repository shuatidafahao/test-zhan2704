package main.java.com.homework.hw1;

import java.util.ArrayList;

public class Demo {
    private static int varClass = 0;

    private final int varInstance;

    public Demo(int val) {
        varClass += 1;
        varInstance = val;
    }

    public int demoClassVar() {
        return varClass;
    }

    public int demoInstanceVar() {
        return varInstance;
    }

    public boolean demoIsPrimeNumber(int val){
        return false;
    }

}
