package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titularConta, double saldoConta) {
        super(numeroConta, titularConta, saldoConta, TipoConta.POUPANCA);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    //TODO: adicionar taxa de deposito de 1%
    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        double valorLiquido = valor - taxa;
        saldoConta += valorLiquido;
        System.out.printf("Depósito: %.2f | Taxa: %.2f | Valor creditado: %.2f%n", valor, taxa, valorLiquido);
        System.out.printf("Saldo atualizado: %.2f%n", saldoConta);
        System.out.println();
    }
}
