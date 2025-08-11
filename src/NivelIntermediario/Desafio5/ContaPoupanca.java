package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor - (valor * 0.01)));
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo de sua conta poupança é: " + getSaldo() + " reais");
    }
}
