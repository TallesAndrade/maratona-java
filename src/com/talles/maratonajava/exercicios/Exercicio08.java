package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int numeroDois = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int numeroTres = scanner.nextInt();

        int[] numeros = {numeroUm, numeroDois, numeroTres};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
