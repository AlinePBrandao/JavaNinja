package Review.LinkedListReview;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> tarefasList = new LinkedList<>();

        int escolha = 0;

        while (escolha != 6){
            System.out.println();
            System.out.println("===== Lista de Tarefas =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Inserir tarefa em posição");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Buscar tarefa");
            System.out.println("6 - Mover tarefa para início da lista");
            System.out.println("7 - Mover tarefa para fim da lista");
            System.out.println("8 - Ordenar lista alfabeticamente");
            System.out.println("9 - Sair");

            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.print("Digite sua tarefa: ");
                    String tarefa = sc.nextLine();
                    tarefasList.addLast(tarefa);
                    System.out.println("Tarefa adicionada");
                    break;

                case 2:
                    System.out.print("Digite sua tarefa: ");
                    tarefa = sc.nextLine();
                    System.out.print("Digite a posição desejada para essa tarefa: ");
                    int posicao = sc.nextInt();
                    sc.nextLine();

                    //NOTE: valida intervalo completo
                    if (posicao < 0 || posicao > tarefasList.size()){
                        System.out.println("Posição inválida");
                    }
                    else {
                        tarefasList.add(posicao, tarefa);
                        System.out.println("Tarefa adicionada");
                    }
                    break;

                case 3:
                    System.out.println("Lista de Tarefas Adicionadas: ");

                    //TODO: validação de lista vazia
                    if (tarefasList.isEmpty()){
                        System.out.println("Você não possui tarefas cadastradas");
                    }
                    else {
                        for (int i = 0; i < tarefasList.size(); i++){
                            System.out.println("Tarefa: " + tarefasList.get(i) + " | Índice: " + i);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Como deseja remover sua tarefa? ");
                    System.out.println("1 - Índice");
                    System.out.println("2 - Nome ");
                    System.out.print("Opção: ");
                    int exclusao = sc.nextInt();
                    sc.nextLine();

                    if (exclusao == 1){
                        System.out.print("Digite a posição da tarefa para exclusão: ");
                        int pos = sc.nextInt();
                        sc.nextLine();

                        boolean removido = (pos >= 0 && pos < tarefasList.size())
                                ? tarefasList.remove(pos) != null : false;
                        System.out.println(removido ? "Tarefa removida" : "Índice inválido");
                        
                    }
                    else if (exclusao == 2) {
                        System.out.print("Digite o nome da tarefa para exclusão: ");
                        String nome = sc.nextLine();

                        boolean removido = tarefasList.contains(nome) ? tarefasList.remove(nome) : false;
                        System.out.println(removido ? "Tarefa removida" : "nome inválido");
                    }
                    else {
                        System.out.println("Opção Inválida");
                    }
                    break;

                case 5:
                    System.out.print("Digite a tarefa desejada: ");
                    String nome = sc.nextLine();

                    //NOTE: melhoria para evitar percorrer a list 2 vezes
                    //NOTE: indexOf percorre todo o indice
                    int indice = tarefasList.indexOf(nome);
                    if (indice != -1){
                        System.out.println("Tarefa: " + nome + "| Índice: " + indice);
                    }
                    else {
                        System.out.println("Tarefa não encontrada");
                    }
                    break;

                case 6:
                    System.out.print("Digite o nome da tarefa que deseja mover ao início da lista:: ");
                    String tarefaTop = sc.nextLine();

                    int indiceMoveTop = tarefasList.indexOf(tarefaTop);

                    if (indiceMoveTop != -1){
                        tarefasList.remove(indiceMoveTop); //NOTE: remove da posição atual
                        tarefasList.addFirst(tarefaTop);
                        System.out.println("Tarefa movida ao topo da lista");
                    }
                    else {
                        System.out.println("Tarefa não encontrada");
                    }
                    break;

                case 7:
                    System.out.print("Digite a tarefa: ");
                    String tarefaLast = sc.nextLine();

                    tarefasList.addLast(tarefaLast);
                    System.out.println("Tarefa adicionada ao fim da lista");
                    break;

                case 8:
                    System.out.println("Lista Ordenada: ");
                    Collections.sort(tarefasList);
                    break;

                case 9:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}
