public class TestaClasse {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.nome = "Gabriel";
        gabriel.cpf = "123432";
        gabriel.profissao = "programador";

        Conta contaDoGabriel = new Conta();
        contaDoGabriel.titular = gabriel;

        Conta contaDaMaria = new Conta();
        contaDaMaria.titular = new Cliente();
        contaDaMaria.titular.nome = "Maria";

        System.out.println(contaDoGabriel.titular.nome);
        System.out.println(contaDaMaria.titular.nome);

    }
}
