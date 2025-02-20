package com.talles.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20 - 5);
    }

    public void multiplicaDoisNumeros(int numA, int numB){
        System.out.println(numA * numB);

    }

    public double divideDoisNumeros(double numA, double numB){
        if (numB == 0 ){
            return 0;
        }
        return numA / numB;
    }

    public double divideDoisNumeros02(double numA, double numB){
        if (numA == 0 || numB == 0){
            return 0;
        }else {
            return numA / numB;
        }
    }

    public void imprimiDivisaoDoisNumeros(double numA, double numB){
        if (numB == 0 ){
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(numA / numB);
    }
    public void alteraDoisNumeros(int numA, int numB){
        numA = 99;
        numB = 33;
        System.out.println("Dentro alteraDoisNumeros");
        System.out.println("NumA "+ numA);
        System.out.println("NumB "+ numB);

    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero:numeros){
            soma += numero;
        }
        System.out.println(soma);

    }

    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for (int numero:numeros){
            soma += numero;
        }
        System.out.println(soma);

    }
}
