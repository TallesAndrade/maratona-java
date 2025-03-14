package com.talles.maratonajava.javacore.Minterfaces.Domain;

public class FileLoader implements DataLoader,DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void dataRemover() {
        System.out.println("Deletando dados de um arquivo");

    }

    @Override
    public void checkPermision() {
        System.out.println("Checando permissões no arquivo");
    }
}
