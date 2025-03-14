package com.talles.maratonajava.javacore.Npoliformismo.Test;

import com.talles.maratonajava.javacore.Npoliformismo.Domain.Computador;
import com.talles.maratonajava.javacore.Npoliformismo.Domain.Produto;
import com.talles.maratonajava.javacore.Npoliformismo.Domain.Tomate;
import com.talles.maratonajava.javacore.Npoliformismo.Service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9" , 3000);


        Tomate produto1 = new Tomate("Cereja",5);
        produto1.setDataDeValidade("21/02/2025");

        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
