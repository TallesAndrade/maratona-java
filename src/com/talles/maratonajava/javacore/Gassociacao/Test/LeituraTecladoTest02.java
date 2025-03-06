package com.talles.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite a sua pergunta e responderei sim ou não");
        String pergunta = scanner.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }
    }
}
