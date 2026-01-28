package Intermediario.Encapsulamento_Enums;

public class Missoes {

    private String nomeMissao;
    private RankMissoes rank;

    //NOTE: Metodo publico para mostrar informaçoes
    public void exibirDetalhes(){
        System.out.printf("Missão: " + nomeMissao + " | Rank: " + rank + "%n" +
                "Descrição: " + rank.getDescrissaoMissao() + " | Nível de Dificuldade: " + rank.getNivelDificuldade() + "%n");
        System.out.println();
    }

    public Missoes(String nomeMissao, RankMissoes rank) {
        this.nomeMissao = nomeMissao;
        this.rank = rank;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public RankMissoes getRank() {
        return rank;
    }

    public void setRank(RankMissoes rank) {
        this.rank = rank;
    }
}
