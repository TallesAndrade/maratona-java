package com.talles.maratonajava.javacore.Bintroducaometodos.test;

import com.talles.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setIdade(70);

        pessoa.imprimir();
    }
}
