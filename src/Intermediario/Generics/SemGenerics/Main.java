package Intermediario.Generics.SemGenerics;

public class Main {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai Simples");
        Kunai kunai2 = new Kunai("Kunai Explosiva");
        Kunai kunai3 = new Kunai("Kunai de Água");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.adicionarKunai(kunai1);
        bolsaKunai.adicionarKunai(kunai2);
        bolsaKunai.adicionarKunai(kunai3);
        System.out.println(bolsaKunai);
    }
}
