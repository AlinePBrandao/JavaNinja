package Intermediario.Polimorfismo;

public class Uchiha extends Ninja implements SharinganInterface{

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
    }
    //NOTE: Interface EstrategiaDeBatalha não precisa ser implementada porque ela já foi implementada pela classe Ninja,
    // logo suas subsclasses herdam

    @Override
    public void inteligenciaDeCombate() {
        super.inteligenciaDeCombate();
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        super.inteligenciaDeCombate(qi);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }
}
