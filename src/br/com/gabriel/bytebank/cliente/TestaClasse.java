package br.com.gabriel.bytebank.cliente;

import br.com.gabriel.bytebank.cliente.conta.Conta;
import br.com.gabriel.bytebank.cliente.conta.ContaCorrente;
import br.com.gabriel.bytebank.cliente.conta.ContaPoupanca;

public class TestaClasse {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente("Gabriel Medeiros","123.456.789-10");
        gabriel.profissao = "programador";

        Conta contaDoGabriel = new Conta();
        contaDoGabriel.setTitular(gabriel);

        Conta contaDaMaria = new Conta();
        contaDaMaria.setTitular(new Cliente("Maria Souza","111.123.234-23"));


        System.out.println(contaDoGabriel.getTitular().nome);
        System.out.println(contaDaMaria.getTitular().nome);

        ContaCorrente contaCorrenteGabriel = new ContaCorrente(123,3333,gabriel);
        contaCorrenteGabriel.deposita(300);
        ContaPoupanca contaPoupancaGabriel = new ContaPoupanca(123,3334,gabriel);
        contaCorrenteGabriel.transfere(50,contaPoupancaGabriel);

        System.out.println(contaCorrenteGabriel.getSaldo());
        System.out.println(contaPoupancaGabriel.getSaldo());




    }
}
