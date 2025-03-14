package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor booleano true ou false");
        boolean valorUm = scanner.nextBoolean();
        System.out.println("Digite um outro valor booleano true ou false");
        boolean valorDois = scanner.nextBoolean();
        System.out.println(valorUm +" "+ valorDois);

        if (valorUm && valorDois){
            System.out.println("Ambos são verdadeiros");
        } else if (!valorUm && !valorDois) {
            System.out.println("Ambos são falsos");

        }else {
            System.out.println("Os valores são diferentes");
        }
        scanner.close();
    }
}
