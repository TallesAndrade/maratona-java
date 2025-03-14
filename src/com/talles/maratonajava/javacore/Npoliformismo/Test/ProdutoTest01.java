package com.talles.maratonajava.javacore.Npoliformismo.Test;

import com.talles.maratonajava.javacore.Npoliformismo.Domain.Computador;
import com.talles.maratonajava.javacore.Npoliformismo.Domain.Televisao;
import com.talles.maratonajava.javacore.Npoliformismo.Domain.Tomate;
import com.talles.maratonajava.javacore.Npoliformismo.Service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("HP", 1500);
        Tomate tomate = new Tomate("Italiano",10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("");
        System.out.println("");
        CalculadoraImposto.calcularImposto(tomate);

        Televisao tv = new Televisao("Samsung 50\"",3500);
        CalculadoraImposto.calcularImposto(tv);
    }
}
