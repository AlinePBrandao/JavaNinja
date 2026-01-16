package Intermediario.Polimorfismo;

public class Uzumaki extends Ninja{

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Essa é meu ataque Uzumaki, um ataque de ar");
    }
}
