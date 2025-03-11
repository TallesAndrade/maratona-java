package com.talles.maratonajava.javacore.Jmodificadorfinal.Test;

import com.talles.maratonajava.javacore.Jmodificadorfinal.Domain.Carro;
import com.talles.maratonajava.javacore.Jmodificadorfinal.Domain.Comprador;
import com.talles.maratonajava.javacore.Jmodificadorfinal.Domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        carro.setNome("BMW");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.comprador);
        carro.comprador.setNome("Jorge");
        System.out.println(carro.comprador);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("SP48");
        ferrari.imprime();
    }
}
