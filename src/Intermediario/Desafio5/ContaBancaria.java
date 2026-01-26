package Intermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    int numeroConta;
    String titularConta;
    double saldoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titularConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta + "\n" +
                "Titular da conta: " + titularConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo conta: " + saldoConta);
    }

    @Override
    public abstract void depositar(double valor);
}
