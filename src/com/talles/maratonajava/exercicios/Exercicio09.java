package com.talles.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é de %.1f%n", imc);
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc > 18.6 && imc < 24.9) {
            System.out.println("Peso ideal (Parábens)");
            
        } else if (imc > 30 && imc < 34.9) {
            System.out.println("Obesidade grau I ");
            
        } else if (imc > 35 && imc < 39.9) {
            System.out.println("Obesidade grau II (Severa) ");
        }else {
            System.out.println("Obesidade grau III (mórbida)");
        }

    }
}
