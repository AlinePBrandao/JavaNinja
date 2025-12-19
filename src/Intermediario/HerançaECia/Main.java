package Intermediario.HerançaECia;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.modoSabioAtivado();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.byakuganAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.modoSabioAtivado();
        Boruto.ativarOKarma();
        Boruto.ativarJougan();
    }
}
