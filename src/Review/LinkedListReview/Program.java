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



        }

        sc.close();
    }
}
