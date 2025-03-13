package com.talles.maratonajava.javacore.Lclasseabstrada.Domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprime");
    }

    public abstract void calculaBonus();
}
