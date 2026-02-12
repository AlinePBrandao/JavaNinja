package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int numeroConta, String titularConta, double saldoConta) {
        super(numeroConta, titularConta, saldoConta, TipoConta.CORRENTE);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar(double valor) {
        saldoConta += valor;
        System.out.println("Saldo atualizado conta " + numeroConta + ": " + saldoConta);
        System.out.println();
    }
}
