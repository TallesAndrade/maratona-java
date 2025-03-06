package com.talles.maratonajava.javacore.Gassociacao.Domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if (professores != null){
            for (Professor professor:professores){
                System.out.println(professor.getNome());
            }
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
