package Intermediario.ClassesAbstratasXInterfaces;

public interface NinjaInterface {

    //NOTE: todos os atributos são automaticamente FINAL.
    String nome = "Naruto Uzumaki";
    int idade = 17;
    String aldeia = "Aldeia da Folha";

    //NOTE: obrigatoriamente abstrato
    public void tacarUmaShuriken();
}
