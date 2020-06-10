package com.d9nich.exercise1;

public class Starter {
    public static void main(String[] args) {
        LinearFunction linearFunction = new LinearFunction("y=3x+5");
        System.out.println("Result for function y=3x+5 in point 1: " + linearFunction.getY(1));
        linearFunction = new LinearFunction("4x+7=y");
        System.out.println("Result for function y=4x+7 in point 1: " + linearFunction.getY(0));
        linearFunction = new LinearFunction("20+4x=y");
        System.out.println("Result for function y=4x+7 in point 1: " + linearFunction.getY(5));
    }
}
