package com.talles.maratonajava.javacore.Bintroducaometodos.test;

import com.talles.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resul = calculadora.divideDoisNumeros(0,25);
        System.out.println(resul);
        System.out.println(calculadora.divideDoisNumeros(25,0));

        calculadora.imprimiDivisaoDoisNumeros(10,15);


    }
}
