package com.talles.maratonajava.javacore.Lclasseabstrada.Domain;

public class Gerente extends Funcionario{
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.05;
    }



    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} ";
    }
}
