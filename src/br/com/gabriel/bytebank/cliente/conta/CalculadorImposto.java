package br.com.gabriel.bytebank.cliente.conta;

public class CalculadorImposto {
    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

}
