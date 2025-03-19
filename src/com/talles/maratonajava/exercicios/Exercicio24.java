package com.talles.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o tempo gasto na viagem (em horas):");
        double tempoViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade média durante a viagem (em km/h):");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoViagem * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.println("\nResumo da viagem:");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros utilizados: " + litrosUsados + " litros");


    }
}