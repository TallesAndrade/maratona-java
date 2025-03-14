package com.talles.maratonajava.javacore.Npoliformismo.Test;

import com.talles.maratonajava.javacore.Npoliformismo.Repositorio.Repositorio;
import com.talles.maratonajava.javacore.Npoliformismo.Repositorio.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
