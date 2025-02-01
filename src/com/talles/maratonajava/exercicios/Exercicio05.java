package com.talles.maratonajava.exercicios;
/*
Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
 (Base para o Salário mínimo R$ 1.293,20).
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minimum wage");
        double minimumWage = scanner.nextDouble();

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        double quantitySalary = salary / minimumWage;
        System.out.printf("Do you received: %.2f salary%n", quantitySalary , "minumum salary");
    }
}
