package com.talles.maratonajava.javacore.Minterfaces.Test;

import com.talles.maratonajava.javacore.Minterfaces.Domain.DataBaseLoader;
import com.talles.maratonajava.javacore.Minterfaces.Domain.DataLoader;
import com.talles.maratonajava.javacore.Minterfaces.Domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        System.out.println();
        dataBaseLoader.dataRemover();
        fileLoader.dataRemover();
        System.out.println();
        dataBaseLoader.checkPermision();
        fileLoader.checkPermision();
        System.out.println();
        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();


    }
}
