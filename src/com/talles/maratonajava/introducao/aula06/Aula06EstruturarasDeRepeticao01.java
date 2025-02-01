package com.talles.maratonajava.introducao.aula06;

public class Aula06EstruturarasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        while (count < 10){
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Dentro do-while");

        }while (count < 10);

        for (int i = 0; i < 10; i++ ){
            System.out.println("Dentro do for " + i);
        }
    }
}
