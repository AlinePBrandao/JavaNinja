package Intermediario.ClassesAbstratasXInterfaces;

public abstract class Ninja {
        String nome;
        int idade;
        String aldeia;

        //NOTE: Metodo abstrato
    public abstract void nomeDoNinja();

    public void tacarKunai(){
        System.out.println("Eu taquei uma kunai");
    }
}
