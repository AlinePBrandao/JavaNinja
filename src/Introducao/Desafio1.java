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

        //TODO: implementar switch case para manu de status da missão
        System.out.print("Informe o status da missão: 1- Em andamento || 2- Concluída: ");
        int statusMissao = sc.nextInt();

        switch (statusMissao){
            case 1:
                System.out.println("Em andamento");
                break;
            case 2:
                System.out.println("Concluída");
                break;
            default:
                System.out.println("Erro, tente novamente.");
                break;
        }

        if (idade < 15){
            if (nivelDificuldade == 'C' || nivelDificuldade == 'D') {
                statusMissao = Integer.parseInt("Concluida");
            } else {
                statusMissao = Integer.parseInt("Não concluida, idade insuficiente");
            }
        } else {
            statusMissao = Integer.parseInt("Concluida");
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
