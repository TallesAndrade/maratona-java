package com.talles.maratonajava.exercicios;

public class Exercicio19 {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        double crescimentoAnoFrancisco =0.02;
        double crescimentoAnoSara =0.03;

        int anos = 0;

        while (alturaSara < alturaFrancisco){
            alturaFrancisco += crescimentoAnoFrancisco;
            alturaSara += crescimentoAnoSara;
            anos++;
        }

        System.out.println("Sara sera mais alta que Francisco em " + anos +" anos" );
    }
}
