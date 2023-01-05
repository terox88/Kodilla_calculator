package com.kodilla.kalkulator;

public class Calculator {
    public void addAToB(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public void subtractAFromB(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAToB(4, 5);
        calculator.subtractAFromB(5, 7);
    }
}
