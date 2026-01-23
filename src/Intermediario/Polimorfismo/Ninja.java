package Intermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{
    //NOTE: não é possível criar objetos a partir de classes abstratas

    String nome;
    String aldeia;
    int idade;
    int numeroMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroMissoesConcluidas = numeroMissoesConcluidas;
        this.rank = rank;
    }

    //NOTE: todos os ninjas terão informações obrigatorias, esse é um método não abstrato
    public void informacoesNinjaUzumaki(){
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos");
        System.out.println("Pertenço a " + aldeia);
        System.out.println();
    }

    public void informacoesNinja(){
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos");
        System.out.println("Pertenço a " + aldeia + ", concluí " + numeroMissoesConcluidas + " missões");
        System.out.println("Meu nível ninja é " + rank);
        System.out.println();
    }

    //NOTE: Método não abstrato, também obrigatório
    public void habilidadeEspecial(){
    }

    //NOTE: Métodos abstratos são obrigatórios instanciados em todas as classes que extenderem a classe Ninja,
    // não possuem corpo
    //public abstract void estrategiaDeBatalha(); convertivo em insteface

    //NOTE: Sobrescrita do método da interface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é a minha estratégia de batalha");
        System.out.println("--------");
    }

    //NOTE: sobrecarga do método sem parâmetro
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Inteligência de combate");
    }
    //NOTE: sobrecarga do método com parâmetro
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é de " + qi + ", você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é de " + qi + ", você é um ninja promissor");
        }
        else {
            System.out.println("Seu QI é de " + qi + ", você precisa treinar mais suas estratégias");
        }
    }
}
