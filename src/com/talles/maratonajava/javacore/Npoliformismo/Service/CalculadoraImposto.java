package com.talles.maratonajava.javacore.Npoliformismo.Service;

import com.talles.maratonajava.javacore.Npoliformismo.Domain.Produto;
import com.talles.maratonajava.javacore.Npoliformismo.Domain.Tomate;

public class CalculadoraImposto {


    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
        }

    }
}
