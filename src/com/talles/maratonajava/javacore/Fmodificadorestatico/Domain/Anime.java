package com.talles.maratonajava.javacore.Eblocoinicializacao.Domain;


public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaco em mémoria pro objeto
    // 2 - Cada atributo da classe é inicializado com valores default ou oque for passado
    // 3 - Bloco de inicializacao executado
    // 4 - Contrutor é executado

    {
        System.out.println("Dentro bloco inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
        for (int episodio:this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
