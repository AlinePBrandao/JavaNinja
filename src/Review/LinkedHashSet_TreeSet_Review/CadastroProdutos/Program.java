package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4){
            System.out.println("----- Opções -----");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Mostrar produtos (ordem de inserção)");
            System.out.println("3. Mostrar produtos (ordem ordenada");
            System.out.println("4. Sair");
        }

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();


        sc.close();
    }
}
