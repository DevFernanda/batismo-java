package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo de sua conta corrente é: " + getSaldo() + " reais");
    }
}
