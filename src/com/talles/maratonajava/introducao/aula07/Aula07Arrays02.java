package com.talles.maratonajava.introducao.aula07;

public class Aula07Arrays02 {

    public static void main(String[] args) {
        //byte, short, int, double, float = 0
        //char = '\0000' ' '
        // boolean = false
        //String = null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Sasuke";
        nomes[3] = "Vegeta";
        for (int i = 0; i < nomes.length ; i++) {
            System.out.printf(nomes[i]);

        }
    }
}
