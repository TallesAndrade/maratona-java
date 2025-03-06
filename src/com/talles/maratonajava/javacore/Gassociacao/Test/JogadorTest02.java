package com.talles.maratonajava.javacore.Gassociacao.Test;

import com.talles.maratonajava.javacore.Gassociacao.Domain.Jogador;
import com.talles.maratonajava.javacore.Gassociacao.Domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Time time = new Time("Santos");
        jogador.setTime(time);
        jogador.imprime();
    }
}
