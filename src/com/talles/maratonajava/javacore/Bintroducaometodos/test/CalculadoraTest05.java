package com.talles.maratonajava.javacore.Bintroducaometodos.test;

import com.talles.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int valor = 1;

        Calculadora calculadora = new Calculadora();
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
