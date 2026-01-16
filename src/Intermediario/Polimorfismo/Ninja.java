package Intermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{
    //NOTE: não é possível criar objetos a partir de classes abstratas

    String nome;
    String aldeia;
    int idade;

    //NOTE: todos os ninjas terão habilidade especial obrigatoriamente
    //NOTE: Método não abstrato
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " essa é minha habilidade especial");
    }

    //NOTE: Métodos abstratos são obrigatórios instanciados em todas as classes que extenderem a classe Ninja,
    // não possuem corpo
    //public abstract void estrategiaDeBatalha(); convertivo em insteface


    //NOTE: Sobrescrita do método da interface
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é a minha estratégia de batalha");
    }
}
