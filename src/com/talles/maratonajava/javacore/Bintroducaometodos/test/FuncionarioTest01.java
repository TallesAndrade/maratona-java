package com.talles.maratonajava.javacore.Bintroducaometodos.test;

import com.talles.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcelo");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1400,3000,2500});
        funcionario.imprimirDados();

    }
}
