package Intermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Missão: "
                + missao + " | Nível de Dificuldade: " + nivelDificuldade +
                " | Status da Missão: " + statusMissao + ".");
    }
}
