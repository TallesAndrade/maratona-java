package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numeroA = scanner.nextInt();
        System.out.println("Digite o primeiro numero");
        int numeroB = scanner.nextInt();
        int quociente = numeroA / numeroB;
        int resto = numeroA % numeroB;

        System.out.println(quociente);
        System.out.println(resto);
    }
}
