package Intermediario.HerancaECia;

public class Boruto extends Uzumaki implements HyugaUzumaki{

    //NOTE: declarar obrigatoriamente os métodos da interface implementada

    @Override
    public void ativarOKarma() {
        System.out.println("O Karma foi ativado! Eu sou um Hyuga Uzumaki");
    }

    @Override
    public void ativarJougan() {
        System.out.println("O Jougan foi ativado!");
    }
}
