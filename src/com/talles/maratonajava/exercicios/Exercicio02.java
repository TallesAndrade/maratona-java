package com.talles.maratonajava.exercicios;
//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number% 2 == 0){
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd");
        }
        if (number > 0){
            System.out.println("This number is positive");
        }else {
            System.out.println("This number is negative");
        }

        scanner.close();
    }
}
