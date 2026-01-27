package Intermediario.Desafio5;

public class BancoKonoha {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(1, "João da Silva", 100.00);
        System.out.println(conta1);
        conta1.consultarSaldo();
        conta1.depositar(10.00);

        ContaPoupanca conta2 = new ContaPoupanca(2, "Maria Rodrigues", 200.00);
        System.out.println(conta2);
        conta2.consultarSaldo();
        conta2.depositar(200.00);

        ContaCorrente conta3 = new ContaCorrente(3, "Eduardo Angelo", 5000.00);
        System.out.println(conta3);
        conta3.consultarSaldo();
        conta3.depositar(500.00);

        conta3.transferir(100.00, conta1);
        conta1.consultarSaldo();
        conta3.consultarSaldo();
    }
}
