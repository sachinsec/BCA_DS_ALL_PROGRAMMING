package com.college.math;

public class Calculator {
    
    private double result;
    
    public double add(double a,double b){
        result = a+b;
        return result;
    }

    public double substract(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

}
