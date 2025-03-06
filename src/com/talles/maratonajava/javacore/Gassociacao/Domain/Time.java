package com.talles.maratonajava.javacore.Gassociacao.Domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome do time:" + this.nome);
        if (jogadores == null){
            return;
        }
        for (Jogador jogador:jogadores){
            System.out.println("Jogador: " + jogador.getNome());
            System.out.println();
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
