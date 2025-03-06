package com.talles.maratonajava.javacore.Gassociacao.Exercicio.Test;

import com.talles.maratonajava.javacore.Gassociacao.Exercicio.Domain.*;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Palmeiras, 123");

        Seminario seminario = new Seminario("Java Avançado", local, null);

        Estudante estudante1 = new Estudante("Talles", 25, seminario);
        Estudante estudante2 = new Estudante("Ana", 22, seminario);

        seminario.setEstudantes(new Estudante[]{estudante1, estudante2});

        Professor professor = new Professor("Carlos", "Desenvolvimento Java", new Seminario[]{seminario});

        System.out.println("Professor: " + professor.getNome() + " | Especialidade: " + professor.getEspecialidade());
        System.out.println("Seminário: " + seminario.getNome());
        System.out.println("Local: " + seminario.getLocal().getEndereco());

        System.out.println("Estudantes:");
        for (Estudante estudante : seminario.getEstudantes()) {
            System.out.println("- " + estudante.getNome() + " | Idade: " + estudante.getIdade());
        }
    }
}
