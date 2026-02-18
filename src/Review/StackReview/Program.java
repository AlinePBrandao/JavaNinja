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

        switch (escolha) {
            case 1:
                if (escolha == 1){
                    System.out.println("Digite a ação: ");
                    String escolha1 = sc.nextLine();
                    stack.push(escolha1);
                    System.out.println("Ação registrada");
                }
                break;

        }








        sc.close();
    }
}
