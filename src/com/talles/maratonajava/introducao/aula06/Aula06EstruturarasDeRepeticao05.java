package com.talles.maratonajava.introducao.aula06;

public class Aula06EstruturarasDeRepeticao05 {
    public static void main(String[] args) {

        int parcela;
        double valorCarro = 30000;

        for (parcela =(int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println(parcela + " parcelas de R$ "+ valorParcela);

        }
    }
}
