package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Product> productsHashSet = new LinkedHashSet<>(); //NOTE: ordem de inserção
        TreeSet<Product> productsTreeSet = new TreeSet<>();//NOTE: ordenados por nome

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();



        sc.close();
    }
}
