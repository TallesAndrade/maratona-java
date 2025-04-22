package com.talles.maratonajava.javacore.Oexception.Runtime.test;

public class RuntimeexceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(9 , 0));

    }

    private static int divisao(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Divisor igual a 0");

        }
        return a / b;
    }
}
