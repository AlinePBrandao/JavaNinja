package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();


        sc.close();
    }
}
