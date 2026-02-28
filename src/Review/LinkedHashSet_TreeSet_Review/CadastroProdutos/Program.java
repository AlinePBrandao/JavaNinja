package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager productManager = new ProductManager();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("----- Opções -----");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Mostrar produtos (ordem de inserção)");
            System.out.println("3. Mostrar produtos (ordem ordenada");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    double preco = sc.nextDouble();
                    productManager.adicionarProduto(nome, preco);
                    break;

                case 2:
                    productManager.mostrarProdutoInsercao();
                    break;

                case 3:
                    productManager.mostrarProdutoOrdenado();
                    break;

                case 4:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}
