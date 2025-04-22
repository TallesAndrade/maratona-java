package com.talles.maratonajava.javacore.Oexception.Error.Test;

public class StackOverFlow {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
