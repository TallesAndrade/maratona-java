package com.talles.maratonajava.javacore.Kenum.Test;

import com.talles.maratonajava.javacore.Kenum.Domain.Cliente;
import com.talles.maratonajava.javacore.Kenum.Domain.TipoCliente;
import com.talles.maratonajava.javacore.Kenum.Domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jorge",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Ana", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2.getNomeRelatorio());

    }
}
