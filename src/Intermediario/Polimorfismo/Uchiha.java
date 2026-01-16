package Intermediario.Polimorfismo;

public class Uchiha extends Ninja{

    //NOTE: Sobrescrita de metodo
    @Override
    public void habilidadeEspecial() {
        System.out.println("Essa é meu ataque Uchiha, um ataque de fogo");
    }
    //NOTE: Interface EstrategiaDeBatalha não precisa ser implementada porque ela já foi implementada pela classe Ninja,
    // logo suas subsclasses herdam
}
