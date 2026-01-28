package Intermediario.Encapsulamento_Enums;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Naruto Uzumaki-----------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 17, 15, 1.80);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome()); //NOTE: MNostra o nome alterado pelo set

       Missoes missao1 = new Missoes("Resgatar cachorro", RankMissoes.D);
       missao1.exibirDetalhes();

       Missoes missao2 = new Missoes("Derrotar Zabuza", RankMissoes.S);
       missao2.exibirDetalhes();


    }
}
