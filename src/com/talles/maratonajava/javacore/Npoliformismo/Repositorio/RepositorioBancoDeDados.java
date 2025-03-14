package com.talles.maratonajava.javacore.Npoliformismo.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
