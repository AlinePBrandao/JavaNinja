package Intermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //NOTE: Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        naruto.informacoesNinja();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        //NOTE: Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;

        sasuke.informacoesNinja();
        sasuke.habilidadeEspecial();

    }
}
