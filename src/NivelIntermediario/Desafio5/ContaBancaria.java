package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // protegido para as subclasses poderem acessar
    protected double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public abstract void consultarSaldo();

    @Override
    public abstract void depositar(double valor);
}
