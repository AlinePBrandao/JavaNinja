package Review.LinkedListReview;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList tarefasList = new LinkedList<>();

        int escolha = 0;

        while (escolha != 6){
            System.out.println();
            System.out.println("===== Lista de Tarefas =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Inserir tarefa em posição");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Buscar tarefa");
            System.out.println("6 - Sair");

            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            System.out.println();

            switch (escolha){
                case 1:
                    System.out.print("Digite sua tarefa: ");
                    String tarefa = sc.nextLine();
                    tarefasList.addLast(tarefa);
                    break;
                case 2:
                    System.out.print("Digite sua tarefa: ");
                    tarefa = sc.nextLine();
                    System.out.print("Digite a posição desejada para essa tarefa: ");
                    int posicao = sc.nextInt();

                    if (posicao > tarefasList.size()){
                        System.out.println("Posição inválida");
                    }
                    else {
                        tarefasList.add(posicao, tarefa);
                    }
                    break;
                case 3:
                    System.out.println("Lista de Tarefas Adicionadas: ");

                    for (int i = 0; i< tarefasList.size(); i++){
                        System.out.println("Tarefa: " + tarefasList.get(i) + " Índice: " + i);
                        System.out.println(" Índice: " + i);
                    }
                    break;
                case 4:
                    System.out.println("Como deseja remover sua tarefa? ");
                    System.out.println("1 - Índice ");
                    System.out.println("2 - Nome ");
                    int exclusao = sc.nextInt();

                    if (exclusao == 1){

                    } else if (exclusao == 2) {

                    }
                    else {
                        System.out.println("Opção Inválida");
                    }
            }

//            if (tarefasList.isEmpty()){
//                System.out.println("Você não possui tarefas cadastradas");
//            }

        }

        sc.close();
    }
}
