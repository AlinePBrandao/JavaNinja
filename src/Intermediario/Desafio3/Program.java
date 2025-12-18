package Intermediario.Desafio3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ninja ninja = new Ninja();

        int ninjasCadastrados = 0;
        int opcoes = 0;
        while (opcoes != 4){

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar Habilidade Especial");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes){
                case 1:
                    System.out.print("Digite o nome do ninja: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Missão: ");
                    String missao = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Nivel de Dificuldade: ");
                    String nivelDificuldade = sc.nextLine();
                    System.out.print("Status da Missão: ");
                    String statusMissao = sc.nextLine();
                    ninjasCadastrados++;
                    System.out.println("Ninja cadastrado com sucesso");
                    ninja.mostrarInformacoes();
                    break;

                case 2:
                    System.out.print("Lista de Ninjas: ");
                    break;

                case 3:
                    System.out.print("Atualizar habilidade especial: ");
                    break;

                case 4:
                    System.out.print("Programa finalizado ");
                    break;

                default:
                    System.out.print("Opçãp inválida ");
            }
        }

        sc.close();

    }
}
