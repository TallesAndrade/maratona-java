package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo");
        int ladoUm = scanner.nextInt();
        System.out.println("Digite o segundo lado do triângulo");
        int ladoDois = scanner.nextInt();
        System.out.println("Digite o terceiro lado do triângulo");
        int ladoTres = scanner.nextInt();

        if (ladoUm + ladoDois > ladoTres && ladoDois + ladoTres > ladoUm && ladoUm + ladoTres > ladoDois){
            if (ladoUm == ladoTres && ladoDois == ladoTres){
                System.out.println("O triângulo é equilátero");
            } else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoUm == ladoTres ){
                System.out.println("O triângulo é isósceles");
            }else {
                System.out.println("O triângulo é escaleno");
            }
        }else {
            System.out.println("Não é um triangulo");
        }

    }
}
