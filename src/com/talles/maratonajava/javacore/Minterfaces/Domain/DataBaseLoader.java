package com.talles.maratonajava.javacore.Minterfaces.Domain;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void dataRemover() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermision() {
        System.out.println("Checando permissões de banco de dados");
    }


    public static void retriveMaxDataSize (){
        System.out.println("Dentro do retriveMaxDataSize na classe DataBaseLoader");

    }
}
