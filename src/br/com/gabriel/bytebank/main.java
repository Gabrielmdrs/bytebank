package br.com.gabriel.bytebank;

import br.com.gabriel.bytebank.cliente.Cliente;
import br.com.gabriel.bytebank.cliente.conta.CalculadorImposto;
import br.com.gabriel.bytebank.cliente.conta.ContaCorrente;

public class main {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente("Gabriel Medeiros","123.4567.891-0");
        ContaCorrente cc = new ContaCorrente(123,0001,gabriel);
        cc.deposita(1000);

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);

    }




}
