package com.talles.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor da hora aula");
        double valorHora = scanner.nextDouble();
        System.out.println("Numeros de aulas lecionadas no mês");
        int numeroAulas = scanner.nextInt();
        System.out.println("Digite a % de desconto do INSS");
        double porcentagemDesconto = scanner.nextDouble() / 100;
        double salarioBruto = valorHora * numeroAulas;

        double valorDesconto = salarioBruto * porcentagemDesconto;
        double salarioLiquido = salarioBruto - valorDesconto;
        System.out.println(salarioLiquido);
    }
}
