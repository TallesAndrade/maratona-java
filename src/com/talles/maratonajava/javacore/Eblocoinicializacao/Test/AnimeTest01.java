package com.talles.maratonajava.javacore.Eblocoinicializacao.Test;

import com.talles.maratonajava.javacore.Eblocoinicializacao.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

    }
}
