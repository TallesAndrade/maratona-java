package com.talles.maratonajava.javacore.Hheranca.Test;

import com.talles.maratonajava.javacore.Hheranca.Domain.Endereco;
import com.talles.maratonajava.javacore.Hheranca.Domain.Funcionario;
import com.talles.maratonajava.javacore.Hheranca.Domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-280");
        Pessoa pessoa = new Pessoa("Carlos","123455-98");
        pessoa.setNome("Carlos");
        pessoa.setCpf("123445-98");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("--------------");

        Funcionario funcionario = new Funcionario("Marcelo","123456-98",2000);
        funcionario.setNome("Marcelo");
        funcionario.setCpf("123456-98");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1500.90);
        funcionario.imprime();
    }
}
