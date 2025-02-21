package com.talles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimirDados() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Salario 3 ultimos meses");
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print("R$" + salario + " ");
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null){
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        System.out.println("\nA media do salario do funcionario é R$" + media / salarios.length);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
