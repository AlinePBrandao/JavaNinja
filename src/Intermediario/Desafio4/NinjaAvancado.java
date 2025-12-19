package Intermediario.Desafio4;

public class NinjaAvancado extends InformacoesNinjas implements Ninja{

    public String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println();
        System.out.println("Meu nome é " + nome + ", sou um Ninja Avançado, minha habilidade de " + habilidade +
                " foi utilizada. Minha Especialidade é " + especialidade);
    }
}
