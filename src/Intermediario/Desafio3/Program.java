package Intermediario.Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Ninja> ninjas = new ArrayList<>();
        //NOTE: estou usando ArrayList porque não desejo definir o tamanho do meu array.

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
                    System.out.print("O ninja é um Uchiha? (s/n): ");
                    String tipo = sc.nextLine();
                    Ninja ninja;
                    if (tipo.equalsIgnoreCase("s")){
                        ninja = new Uchiha();
                        System.out.print("Habilidade Especial: ");
                       ((Uchiha) ninja).habilidadeEspecial = sc.nextLine();
                    }
                    else{
                        ninja = new Ninja();
                    }

                    System.out.print("Digite o nome do ninja: ");
                    ninja.nome  = sc.nextLine();
                    System.out.print("Idade: ");
                    ninja.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Missão: ");
                    ninja.missao = sc.nextLine();
                    System.out.print("Nivel de Dificuldade: ");
                    ninja.nivelDificuldade = sc.nextLine();
                    System.out.print("Status da Missão: ");
                    ninja.statusMissao = sc.nextLine();

                    ninjas.add(ninja);
                    System.out.println("Ninja cadastrado com sucesso");
                    break;

                case 2:
                    if (ninjas.isEmpty()){
                        System.out.println("Nenhum ninja encontrado");
                    }
                    else{
                        for (int i=0; i<ninjas.size(); i++){
                            System.out.println();
                            System.out.println("Ninjas: " + (i + 1));
                            ninjas.get(i).mostrarInformacoes();
                        }
                    }
                    break;

                case 3:
                    if (ninjas.isEmpty()){
                        System.out.println("Nenhum ninja encontrado");
                    }
                    System.out.print("Digite o nome do ninja que deseja atualizar a habilidade: ");
                    String nomeAtualizar = sc.nextLine();
                    boolean encontrado = false;

                    for (Ninja n : ninjas){
                        if (n.nome.equalsIgnoreCase(nomeAtualizar)){
                            encontrado = true;

                            if (n instanceof Uchiha){
                                System.out.print("Nova habilidade especial: ");
                                ((Uchiha) n).habilidadeEspecial = sc.nextLine();
                                System.out.print("Habilidade especial atualizada: ");
                            }
                            else {
                                System.out.println("Esse ninja não é um Uchiha");
                            }
                            break;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Ninja não encontrado");
                    }
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
