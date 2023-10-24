package br.com.gabriel.bytebank.cliente;

import br.com.gabriel.bytebank.funcionario.AutenticacaoUtil;

public class Cliente {

    protected String nome;
    protected String cpf;
    protected String profissao;
    private AutenticacaoUtil autenticador;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.autenticador = new AutenticacaoUtil();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }


    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
