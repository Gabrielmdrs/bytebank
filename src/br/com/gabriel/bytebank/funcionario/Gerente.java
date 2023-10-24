package br.com.gabriel.bytebank.funcionario;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }else {
            System.out.println("Acesso negado");
            return false;
        }
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return getSalario()*2;
    }

    public int getSenha() {
        return senha;
    }


}
