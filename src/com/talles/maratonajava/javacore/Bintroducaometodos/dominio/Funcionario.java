package com.talles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
        double somaSalarios = 0;
        if (salarios == null){
            return;
        }

        for (double salario : salarios) {
            somaSalarios += salario;
        }
        System.out.println("\nA media do salario do funcionario é R$" + somaSalarios / salarios.length);
    }
}
