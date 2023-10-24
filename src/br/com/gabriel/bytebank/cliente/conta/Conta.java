package br.com.gabriel.bytebank.cliente.conta;

import br.com.gabriel.bytebank.cliente.Cliente;

public class Conta {
    private double saldo = 100;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        ContaCorrente contaCorrente = new ContaCorrente(agencia,numero,titular);
    }
    public Conta(){

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void transfere(double valor, Conta destino){
        if (this.saldo>=valor) {
            this.saca(valor);
            destino.deposita(valor);
        }

    }

}