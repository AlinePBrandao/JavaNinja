package Introducao;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 10;
        String[] ninjas = new String[max];

        int ninjasCadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar NinjasGenerico");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();
            sc.nextLine();

        switch (opcoes){
            case 1:
                if (ninjasCadastrados < max) {
                    System.out.print("Digite o nome do ninja cadastrado: ");
                    String nomeNinja = sc.nextLine();
                    ninjas[ninjasCadastrados] = nomeNinja;
                    ninjasCadastrados++;
                    System.out.println("Ninja cadastrado com sucesso");
                }
                else {
                    System.out.println("A lista está cheia");
            }
            break;
            case 2:
                if (ninjasCadastrados == 0){
                    System.out.println("Nenhum ninja encontrado");
                }
                else {
                    System.out.println("Lista de ninjas: ");
                    for (String ninja : ninjas) {
                        System.out.println(ninja);
                    }
            }
            break;
            case 3:
                System.out.println("Programa finalizado");
            break;
            default:
                System.out.println("Opção inválida");
            break;
        }
        }
        sc.close();
    }
}
