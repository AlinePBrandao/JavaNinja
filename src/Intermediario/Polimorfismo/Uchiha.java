package Intermediario.Polimorfismo;

public class Uchiha extends Ninja{

    public Uchiha() {
        super(); //NOTE: super() sem argumentos indica o constructor vazio da super classe.
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
    //NOTE: sobrecarga do constructor
    public Uchiha(String nome, String aldeia, int idade, int numeroMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroMissoesConcluidas, rank);
    }

    //NOTE: Sobrescrita de metodo
    @Override
    public void habilidadeEspecial() {
        System.out.println("Essa é meu ataque Uchiha, um ataque de fogo");
        System.out.println("--------");
    }
    //NOTE: Interface EstrategiaDeBatalha não precisa ser implementada porque ela já foi implementada pela classe Ninja,
    // logo suas subsclasses herdam
}
