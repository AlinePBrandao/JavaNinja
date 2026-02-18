package Review.StackReview;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Undo ===");
        System.out.println("1 - Registrar ação");
        System.out.println("2 - Desfazer última ação");
        System.out.println("3 - Listar ações");
        System.out.println("4 - Sair");

        System.out.println("Escolha: ");
        int escolha = sc.nextInt();

        



        Stack<String> stack = new Stack<>();




        sc.close();
    }
}
