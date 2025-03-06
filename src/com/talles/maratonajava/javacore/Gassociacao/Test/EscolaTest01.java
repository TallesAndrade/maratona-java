package com.talles.maratonajava.javacore.Gassociacao.Test;

import com.talles.maratonajava.javacore.Gassociacao.Domain.Escola;
import com.talles.maratonajava.javacore.Gassociacao.Domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        professor1.setNome("Marcos");
        professor2.setNome("Carlos");
        Escola escola = new Escola("E.M. Padre Camargos");
        Professor[] professor = {professor1,professor2};
        escola.setProfessores(professor);
        escola.imprime();
    }
}
