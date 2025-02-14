package com.talles.maratonajava.javacore.Aintroducaoclasses.teste;

import com.talles.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.print("Nome "+ professor.nome + " idade " + professor.idade + " sexo " + professor.sexo);
    }
}
