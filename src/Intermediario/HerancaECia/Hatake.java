package Intermediario.HerancaECia;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void boasVindas(){
        System.out.println("Meu nome é " + nome + ". Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativou!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Eu sou um ninja de elite da ANBU");
    }
}
