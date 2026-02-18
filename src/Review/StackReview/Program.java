package Review.StackReview;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        System.out.println("=== Menu Undo ===");
        System.out.println("1 - Registrar ação");
        System.out.println("2 - Desfazer última ação");
        System.out.println("3 - Listar ações");
        System.out.println("4 - Sair");

        System.out.print("Escolha: ");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                if (escolha == 1){
                    System.out.print("Digite a ação: ");
                    String acao = sc.nextLine();
                    sc.nextLine();
                    stack.push(acao);
                    System.out.println("Ação registrada");
                }
            break;
            case 2:
                if (escolha == 2) {
                    System.out.print("Desfeita: ");
                    String desfeita = sc.nextLine();
                    stack.pop();
                    System.out.println("Ação registrada");
                }
        }




        sc.close();
    }
}
