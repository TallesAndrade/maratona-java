package com.talles.maratonajava.exercicios;

import java.util.Scanner;

/*
    Faça um algoritmo que leia dois valores inteiros A e B,
     se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B.
 Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo){
            int sumNumberOneNumberTwo = numberOne+numberTwo;
            System.out.println("The sum of the first number and the second number is "+ sumNumberOneNumberTwo);
        }else {
            int multiplicationNumberOneNumberTwo = numberOne * numberTwo;
            System.out.println("The multiplication of the firt number and the second number is "+ multiplicationNumberOneNumberTwo);
        }

    }
}
