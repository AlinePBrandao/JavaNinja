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


        }

        sc.close();
    }
}
