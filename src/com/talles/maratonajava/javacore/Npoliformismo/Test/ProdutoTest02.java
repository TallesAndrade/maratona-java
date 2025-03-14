package com.talles.maratonajava.javacore.Npoliformismo.Test;

import com.talles.maratonajava.javacore.Npoliformismo.Domain.Computador;
import com.talles.maratonajava.javacore.Npoliformismo.Domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9" , 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
