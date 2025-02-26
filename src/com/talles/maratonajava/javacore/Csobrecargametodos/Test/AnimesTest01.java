package com.talles.maratonajava.javacore.Csobrecargametodos.Test;

import com.talles.maratonajava.javacore.Csobrecargametodos.Domain.Anime;

public class AnimesTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Psycho Pass","Tv",12,"Suspense");

        anime.imprime();
    }
}
