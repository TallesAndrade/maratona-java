package com.talles.maratonajava.javacore.Aintroducaoclasses.teste;

import com.talles.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.modelo = "Palio";
        carro1.ano = 2005;
        System.out.println("Nome carro " + carro1.nome + " modelo " +carro1.modelo + " ano " +carro1.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2008;
        System.out.println("Nome carro " + carro2.nome + " modelo " +carro2.modelo + " ano " +carro2.ano);

        carro1 = carro2;
        System.out.println(carro1);
    }
}
