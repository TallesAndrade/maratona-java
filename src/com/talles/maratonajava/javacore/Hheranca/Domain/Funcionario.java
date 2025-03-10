package com.talles.maratonajava.javacore.Hheranca.Domain;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização pessoa 2");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
        System.out.println("Dentro do contrutor funcionario");
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
