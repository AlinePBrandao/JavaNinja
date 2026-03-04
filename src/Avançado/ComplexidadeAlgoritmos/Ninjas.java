package Avançado.ComplexidadeAlgoritmos;

public class Ninjas {

    String nome;
    int idade;

    public Ninjas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome do Ninja: " + nome + " | Idade: " + idade;
    }
}
