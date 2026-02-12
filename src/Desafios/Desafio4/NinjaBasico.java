package Desafios.Desafio4;

public class NinjaBasico extends InformacoesNinjas implements Ninja{

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        super(nome, idade, habilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println();
        System.out.println("Meu nome é " + nome + ", sou um Ninja Básico, minha habilidade de " + habilidade + " foi utilizada");
    }
}
