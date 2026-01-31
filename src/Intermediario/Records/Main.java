package Intermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@emailo.com", 99999999);
        System.out.println("Cadastro: " + cadastro);
        System.out.println("Nome do cadastro: " + cadastro.getNome());

        NinjaRecord ninjaRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", 11111111);
        System.out.println("Cadastro: " + ninjaRecord);
        System.out.println(ninjaRecord.emailMaiusculo());
        System.out.println("Nome do cadastro usando Records: " + ninjaRecord.nome());
    }
}
