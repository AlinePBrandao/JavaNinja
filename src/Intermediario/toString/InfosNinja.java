package Intermediario.toString;

public abstract class InfosNinja {
    String nome;
    String aldeia;
    int idade;

    public InfosNinja() {
    }

    public InfosNinja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + ", pertenço a aldeia " + aldeia + ", tenho " + idade + " anos.";
    }
}
