package com.talles.maratonajava.javacore.Gassociacao.Test;

import com.talles.maratonajava.javacore.Gassociacao.Domain.Jogador;
import com.talles.maratonajava.javacore.Gassociacao.Domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Barcelona");
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Punhol");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

        System.out.println("---Time----");
        time.imprime();
    }
}
