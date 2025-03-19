package com.talles.maratonajava.exercicios;

import com.talles.maratonajava.javacore.Gassociacao.Exercicio.Domain.Local;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = scanner.nextInt();
        int diferenca = LocalDate.now().getYear() - anoNascimento;
        int mesAtual = LocalDate.now().getMonthValue();
        int diaAtual = LocalDate.now().getDayOfMonth();
        System.out.println(diferenca);
        System.out.println(mesAtual);
        System.out.println(diaAtual);

    }
}
