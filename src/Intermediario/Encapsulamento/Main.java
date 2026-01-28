package Intermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Naruto Uzumaki-----------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 17, 15, 1.80);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome()); //NOTE: MNostra o nome alterado pelo set

        System.out.println("-----------------Sasuke Uchiha-----------------");
    }
}
