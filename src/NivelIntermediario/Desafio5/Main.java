package NivelIntermediario.Desafio5;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(0.00);
        conta.consultarSaldo();
        conta.depositar(100.00);
        conta.consultarSaldo();


        ContaPoupanca contaPoupanca = new ContaPoupanca(0.00);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(100.00);
        contaPoupanca.consultarSaldo();

    }

}
