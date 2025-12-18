package Intermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, minha missão é "
                + missao + ", ela tem o nível de dificuldade " + nivelDificuldade +
                ", e o status da missão é " + statusMissao + ".");
    }
}
