package com.talles.maratonajava.exercicios;
//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of A");
        int valueA = scanner.nextInt();
        System.out.println("Enter the value of B");
        int valueB = scanner.nextInt();
        System.out.println("Enter the value of C");
        int valueC = scanner.nextInt();
        int sumAB = valueA + valueB;
        System.out.println(sumAB);
        if (sumAB > valueC){
            System.out.println("The sum of A + B is greater than C");
        }else {
            System.out.println("The sum of A + B is less than C");
        }

    }


}
