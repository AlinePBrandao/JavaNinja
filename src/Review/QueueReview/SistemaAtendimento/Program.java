package Review.QueueReview.SistemaAtendimento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> filaClientes = new LinkedList<>();

        int opcao = 0;

        while(opcao != 5){
            System.out.println("=== Menu Atendimento ===");
            System.out.println("1 - Adicionar cliente à fila");
            System.out.println("2 - Atender próximo cliente");
            System.out.println("3 - Ver próximo da fila");
            System.out.println("4 - Listar clientes aguardando");
            System.out.println("5 - Sair");

            System.out.println("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    filaClientes.add(sc.nextLine());
                    System.out.println("Cliente registrado");
                    break;

            }
        }
        sc.close();
    }
}
