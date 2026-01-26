package Intermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, String titularConta, double saldoConta) {
        super(numeroConta, titularConta, saldoConta);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar(double valor) {
        valor = saldoConta + valor;
        System.out.println("Saldo atualizado: " + valor);
        System.out.println();
    }
}
