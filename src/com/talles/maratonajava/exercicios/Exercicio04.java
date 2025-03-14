package com.talles.maratonajava.exercicios;

import java.util.Scanner;

/*
Faça um algoritmo que receba um número inteiro
e imprima na tela o seu antecessor e o seu sucessor.
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int predecessor = number - 1;
        int successor = number + 1;
        System.out.println("The predecessor of " + number + " is " + predecessor +" the sucessor is " + successor);

        scanner.close();
    }
}
