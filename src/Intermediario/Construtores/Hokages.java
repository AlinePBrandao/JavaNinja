package Intermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    //NOTE: No-Args
    public Hokages() {
    }

    //NOTE: All-Args
    public Hokages (String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
