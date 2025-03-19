package com.talles.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Digite a 1º nota:");
        double notaUm = scanner.nextDouble();

        System.out.println("Digite a 2º nota:");
        double notaDois = scanner.nextDouble();

        System.out.println("Digite a 3º nota:");
        double notaTres = scanner.nextDouble();

        System.out.println("Digite a 4º nota:");
        double notaQuatro = scanner.nextDouble();

        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        System.out.printf("A média do aluno é %.1f%n", media);

        if (media >= 7){
            System.out.println("Você passou congratulations");
        }else {
            System.out.println("Você reprovou fuck shit");
        }
    }
}
