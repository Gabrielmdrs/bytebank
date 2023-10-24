package br.com.gabriel.bytebank.funcionario;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Funcionario bruno = new Funcionario();
        bruno.setNome("Breno do Santos");
        bruno.setCpf("123.456.789-10");
        bruno.setSalario(2500);

        //test gerente//
        Gerente gerente = new Gerente();
        gerente.setNome("Jose Carlos");
        gerente.setSenha(12345);


        System.out.println(gerente.getNome()+" digite sua senha de acesso:");
        gerente.autentica(leitura.nextInt());






    }
}
