package Intermediario.Polimorfismo;

public class Uchiha extends Ninja{

    //Sobrescrita de método
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " essa é meu ataque Uchiha, um ataque de fogo");
    }
}
