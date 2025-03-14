package com.talles.maratonajava.javacore.Npoliformismo.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
