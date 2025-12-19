package Intermediario.Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: abrir scanner, referenciar atributos, solicitar valores, construir mensagem de retorno
        Scanner sc = new Scanner(System.in);

        NinjaBasico Aline = new NinjaBasico("Aline Brandão", 23, TipoHabilidade.TAIJUTSU);

        NinjaAvancado Fiasco = new NinjaAvancado("Fiasco", 40, TipoHabilidade.RINNENGAN, "Beber cerveja");

        Aline.mostrarInformacoes();
        Aline.executarHabilidade();

        Fiasco.mostrarInformacoes();
        Fiasco.executarHabilidade();

        sc.close();

    }
}
