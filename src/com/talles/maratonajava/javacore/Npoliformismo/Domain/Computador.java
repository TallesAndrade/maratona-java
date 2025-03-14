package com.talles.maratonajava.javacore.Npoliformismo.Domain;

public class Computador extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.1;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        double valorImposto = getValor() * IMPOSTO_POR_CENTO;
        System.out.println("Imposto sobre o computador é : R$" + valorImposto);
        return valorImposto;
    }
}
