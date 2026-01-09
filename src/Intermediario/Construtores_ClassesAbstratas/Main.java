package Intermediario.Construtores_ClassesAbstratas;

public class Main {
    public static void main(String[] args) {

        Senju Hashirama = new Senju();
        Hashirama.nome = "Sashirama Senju";
        Hashirama.idade = 45;
        System.out.println(Hashirama.nome);
        System.out.println(Hashirama.idade);
        System.out.println(Hashirama.vivoOuNao);
        Hashirama.sabedoriaHokage();

    }
}
