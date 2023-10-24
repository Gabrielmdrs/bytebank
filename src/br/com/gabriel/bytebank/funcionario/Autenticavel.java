package br.com.gabriel.bytebank.funcionario;

public abstract interface Autenticavel  {


    public void setSenha(int senha);


    public boolean autentica (int senha);


}
