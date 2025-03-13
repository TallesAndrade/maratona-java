package com.talles.maratonajava.javacore.Lclasseabstrada.Test;

import com.talles.maratonajava.javacore.Lclasseabstrada.Domain.Desenvolvedor;
import com.talles.maratonajava.javacore.Lclasseabstrada.Domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcelo",2500d);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcelo",3000d);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
        gerente.imprime();
    }
}
