package Intermediario.Encapsulamento_Enums;

public enum RankMissoes {
    D("Baixo", 1),
    C("Moderado", 2),
    B("Confortável", 3),
    A("Difícil", 4),
    S("Altíssimo", 5);

    private String descrissaoMissao;
    private int nivelDificuldade;

    //NOTE: obriga que cada elemento do Enum tenha os atributos obrigatórios.
    RankMissoes(String descrissaoMissao, int nivelDificuldade) {
        this.descrissaoMissao = descrissaoMissao;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getDescrissaoMissao() {
        return descrissaoMissao;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }
}
