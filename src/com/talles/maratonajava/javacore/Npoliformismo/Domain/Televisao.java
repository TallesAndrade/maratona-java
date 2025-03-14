package com.talles.maratonajava.javacore.Npoliformismo.Domain;

public class Televisao extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.1;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto televisão");
        return this.getValor() * IMPOSTO_POR_CENTO;
    }
}
