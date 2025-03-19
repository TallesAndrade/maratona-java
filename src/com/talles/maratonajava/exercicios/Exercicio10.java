package com.talles.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Digite a 1º nota:");
        double notaUm = scanner.nextDouble();

        System.out.println("Digite a 2º nota:");
        double notaDois = scanner.nextDouble();

        System.out.println("Digite a 3º nota:");
        double notaTres = scanner.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;

        System.out.printf("A média do aluno é %.1f%n", media);
    }
}
