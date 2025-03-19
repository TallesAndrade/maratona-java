package com.talles.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a temperatura em Fahrenheit ");
        double fahrenheint = scanner.nextDouble();
        double celsius = (5*(fahrenheint-32) / 9);
        System.out.println(fahrenheint + "º fahrenheit em celsius é  "+ celsius + "º");
    }
}
