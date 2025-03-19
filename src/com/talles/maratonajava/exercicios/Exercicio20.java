package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor base que você quer a tabuada");
        int valorBase = scanner.nextInt();
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + "*" + valorBase + "=" + i*valorBase);
        }



    }
}
