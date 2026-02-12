package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta {

    int numeroConta;
    String titularConta;
    double saldoConta;
    TipoConta conta;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titularConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
    }

    public ContaBancaria(int numeroConta, String titularConta, double saldoConta, TipoConta conta) {
        this(numeroConta, titularConta, saldoConta);
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta + "\n" +
                "Titular da conta: " + titularConta + "\n" +
                "Tipo da conta: " + conta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo conta " + numeroConta + ": " + saldoConta);
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public boolean sacar(double valor) {
        if (valor <=0){
            System.out.println("Valor inválido.");
            return false;
        }
        if (saldoConta < valor){
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldoConta -= valor;
        return true;
    }

    public boolean transferir(double valor, ContaBancaria contaDestino){
        if (this.sacar(valor)){
            contaDestino.depositar(valor);
            System.out.println("Transferência concluída!");
            return true;
        }
        System.out.println("Transferência não realizada");
        return false;
    }
}
