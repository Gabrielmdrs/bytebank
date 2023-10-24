package br.com.gabriel.bytebank.controle;

import br.com.gabriel.bytebank.funcionario.Gerente;

public class controle {

    int soma;
    public void registraBonificacao(Gerente gerente){
        this.soma += gerente.getBonificacao();
    }


}
