package com.talles.maratonajava.introducao.aula06;

public class Aula06EstruturarasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado a valor de um carro, descrubra quantas vezes ele pode ser parcelado.
        //Condição valorParcela >= 1000
        int parcela;
        double valorCarro = 30000;
        double valorParcela;
        for (parcela = 1; parcela <= valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + " parcelas de R$ " + valorParcela);
        }
    }
}
