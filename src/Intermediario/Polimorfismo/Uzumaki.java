package Intermediario.Polimorfismo;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroMissoesConcluidas, rank);
    }

    //NOTE: sobrecarga com o atributo Bijus que só é referenciada nessa classe
    public Uzumaki(String nome, String aldeia, int idade, int numeroMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroMissoesConcluidas, rank); //NOTE: super vem da superclasse
        this.biju = biju; //NOTE: this vem dessa classe
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Essa é meu ataque Uzumaki, um ataque de ar");
    }
}
