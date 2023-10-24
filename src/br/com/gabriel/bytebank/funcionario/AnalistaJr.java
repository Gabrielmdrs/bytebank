package br.com.gabriel.bytebank.funcionario;

public class AnalistaJr extends Funcionario implements Autenticavel{


    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
