package com.talles.maratonajava.javacore.Npoliformismo.Repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
