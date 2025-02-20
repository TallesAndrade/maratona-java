package com.talles.maratonajava.javacore.Bintroducaometodos.test;

import com.talles.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Jorge";
        estudante01.idade = 17;
        estudante01.sexo = 'M';

        estudante02.nome = "Marcela";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
