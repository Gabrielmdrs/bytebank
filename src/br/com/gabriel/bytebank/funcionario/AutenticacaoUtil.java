package br.com.gabriel.bytebank.funcionario;

public class AutenticacaoUtil {

    public int senha;

    public void setSenha(int senha) {


    }


    public boolean autentica(int senha) {
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }


}
