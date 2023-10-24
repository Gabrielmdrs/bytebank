package br.com.gabriel.bytebank.cliente.conta;

import br.com.gabriel.bytebank.cliente.Cliente;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int Ag, int cont, Cliente titular){
        super(Ag, cont, titular);

    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor);
    }

    @Override
    public double getValorImposto() {
        return 42;
    }
}
