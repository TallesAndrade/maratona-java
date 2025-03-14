package com.talles.maratonajava.javacore.Npoliformismo.Domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.03;
    private String dataDeValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public double calcularImposto() {
        double valorImposto = getValor() * IMPOSTO_POR_CENTO;
        System.out.println("O valor sobre o imposto do tomate é: R$"+valorImposto);
        return valorImposto;
    }
}
