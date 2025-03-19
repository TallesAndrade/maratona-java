package com.talles.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em duas vezes (sem juros)");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais (10% de juros)");

        int opcao = scanner.nextInt();
        double desconto;
        double valorFinal = valorCompra;
        double valorParcela;

        switch (opcao) {
            case 1:
                desconto = valorCompra * 0.15;
                valorFinal -= desconto;
                System.out.printf("O valor da compra com desconto é R$ %.2f%n", valorFinal);
                break;
            case 2:
                desconto = valorCompra * 0.10;
                valorFinal -= desconto;
                System.out.printf("O valor da compra com desconto é R$ %.2f%n", valorFinal);
                break;
            case 3:
                valorParcela = valorCompra / 2;
                System.out.printf("O valor de cada uma das 2 parcelas é R$ %.2f%n", valorParcela);
                break;
            case 4:
                System.out.println("Digite o número de parcelas:");
                int parcelas = scanner.nextInt();

                if (parcelas < 3) {
                    System.out.println("Número de parcelas inválido para essa opção.");
                } else {
                    valorFinal = valorCompra * 1.10;
                    valorParcela = valorFinal / parcelas;
                    System.out.printf("O valor total da compra com juros é R$ %.2f%n", valorFinal);
                    System.out.printf("O valor de cada uma das %d parcelas é R$ %.2f%n", parcelas, valorParcela);
                }
                break;
            default:
                System.out.println("Opção inválida! Escolha uma opção entre 1 e 4.");
        }

        scanner.close();
    }
}
