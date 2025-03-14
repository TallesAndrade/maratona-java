package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor qualquer");
        double valor = scanner.nextDouble();
        System.out.println(valor + valor * 0.05);
        scanner.close();
    }
}
