package com.talles.maratonajava.javacore.Minterfaces.Domain;

public interface DataLoader {

    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermision(){
        System.out.println("Fazendo checagem de permissões");
    }

    static void retriveMaxDataSize (){
        System.out.println("Dentro do retriveMaxDataSize na interface");

    }
}
