package com.talles.maratonajava.exercicios;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
        Random random = new Random();
        int valorMaximo = 101;
        int valorAleatorio = random.nextInt(valorMaximo);
        System.out.println(valorAleatorio);
    }
}
