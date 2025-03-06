package com.talles.maratonajava.javacore.Gassociacao.Test;

import com.talles.maratonajava.javacore.Gassociacao.Domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Maradora");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] jogadors = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador:jogadors){
            jogador.imprime();
        }
    }
}
