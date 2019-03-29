package com.mycompany.app;

public class CalculatorImpl implements Calculator {
    public static void main(String[] args){
        CalculatorImpl calc = new CalculatorImpl();
        System.out.println("CALCULATOR");
        System.out.println("1 + 3 is " + calc.add(1,3));
        System.out.println("1 - 3 is " + calc.substract(1,3));
        System.out.println("1 * 3 is " + calc.multiply(1,3));
        System.out.println("1 / 3 is " + calc.divide(1,3));
    }

    @Override
    public int add(int x, int y){
        return x + y;
    }

    @Override
    public int substract(int x, int y){
        return x - y;
    }

    @Override
    public int multiply(int x, int y){
        return x * y;
    }

    @Override
    public float divide(int x, int y){
        return (float) x / y;
    }
}
