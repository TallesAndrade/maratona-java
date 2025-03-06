package com.talles.maratonajava.javacore.Gassociacao.Exercicio.Domain;

public class Seminario {
    private String nome;
    private Local local;
    private Estudante[] estudantes;


    public Seminario(String nome, Local local, Estudante[] estudantes) {
        this.nome = nome;
        this.local = local;
        this.estudantes = estudantes;
    }

    public Seminario(String nome) {
        this.nome = nome;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
