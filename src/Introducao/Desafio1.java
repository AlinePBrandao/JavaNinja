package Introducao;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String ninja = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Missão: ");
        sc.nextLine();
        String missao = sc.nextLine();
        System.out.print("Nivel de Dificuldade: ");
        char nivelDificuldade = sc.next().charAt(0);

        System.out.print("Informe o status da missão: ");
        sc.nextLine();
        String statusMissao = sc.nextLine();

        if (idade < 15){
            if (nivelDificuldade == 'C' || nivelDificuldade == 'D') {
                statusMissao = "Concluida";
            } else {
                statusMissao = "Não concluida, idade insuficiente";
            }
        } else {
            statusMissao = "Concluida";
        }

        System.out.println();
        System.out.println("Informações do Ninja: " );
        System.out.println("Nome: " +  ninja );
        System.out.println("Idade: " + idade );
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de Dificuldade: " + nivelDificuldade );
        System.out.println("Status da Missão: " + statusMissao );

        sc.close();
    }
}
