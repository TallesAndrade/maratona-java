package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int valorB = scanner.nextInt();
        int valorC = valorA;
        valorA = valorB;
        valorB = valorC;

        System.out.println("Valor A: " + valorA);
        System.out.println("Valor B: " + valorB);

    }
}
