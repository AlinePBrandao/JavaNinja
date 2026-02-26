package Review.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Convidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> convidados = new HashSet<>();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("----- Opções -----");
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Ver lista de convidados");
            System.out.println("3. Ver quantidade total");
            System.out.println("4. Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
    }
}
