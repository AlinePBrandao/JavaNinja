package Review.QueueReview.SistemaAtendimento;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> filaNormal = new LinkedList<>();
        Queue<String> filaPrioridade = new PriorityQueue<>();

        int opcao = 0;

        while(opcao != 6){
            System.out.println("=== Menu Atendimento ===");
            System.out.println("1 - Adicionar cliente prioritário à fila");
            System.out.println("2 - Adicionar cliente normal à fila");
            System.out.println("3 - Atender próximo cliente");
            System.out.println("4 - Ver próximo da fila");
            System.out.println("5 - Listar clientes aguardando");
            System.out.println("6 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do cliente prioritário: ");
                    filaPrioridade.add(sc.nextLine());
                    System.out.println("Cliente prioritário registrado");
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    filaNormal.add(sc.nextLine());
                    System.out.println("Cliente registrado");
                    break;

                case 3:
                    if (!filaPrioridade.isEmpty()){
                        String prioritarioAtendido = filaPrioridade.poll();
                        System.out.println("Cliente prioritário atendido: ");
                    }
                    else if (filaNormal.isEmpty()){
                        System.out.println("Nenhum cliente aguardando");
                    }
                    else {
                        String atendido = filaNormal.poll();
                        System.out.println("Cliente atendido: " + atendido);
                    }
                    break;

                case 4:
                    if (!filaPrioridade.isEmpty()){
                        System.out.println("Próximo cliente prioritário na fila: " + filaPrioridade.peek());
                    }
                    if (filaNormal.isEmpty()){
                        System.out.println("Nenhum cliente aguardando");
                    }
                    else {
                        System.out.println("Próximo cliente na fila: " + filaNormal.peek());
                    }
                    break;

                case 5:
                    if (filaNormal.isEmpty()){
                        System.out.println("Nenhum cliente aguardando");
                    }
                    else {
                        System.out.println("Clientes na fila: " + filaNormal);
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}
