package com.talles.maratonajava.javacore.Hheranca.Domain;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void relatorio(){
        System.out.println("Eu " + this.nome + "recebi R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
