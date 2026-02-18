package Review.StackReview;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        int escolha = 0;

        while (escolha != 4){
            System.out.println("=== Menu Undo ===");
            System.out.println("1 - Registrar ação");
            System.out.println("2 - Desfazer última ação");
            System.out.println("3 - Listar ações");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1 -> {
                    System.out.print("Digite a ação: ");
                    String acao = sc.nextLine();
                    stack.push(acao);
                    System.out.println("Ação registrada");
                }

                case 2 -> {
                    if (stack.isEmpty()){
                        System.out.println("Não há ações para desfazer");
                    }
                    else {
                        String desfeita = stack.pop();
                        System.out.println("Ação desfeita: " + desfeita);
                    }
                }

                case 3 -> {
                    if (stack.isEmpty()){
                        System.out.println("Não há ações registradas");
                    }
                    else {
                        System.out.println("Ações cadastradas: " + stack);
                    }
                }

                case 4 -> {
                    System.out.println("Programa encerrado");
                }
                default -> {
                    System.out.println("Opção inválida");
                }
            }
        }
        sc.close();
    }
}
