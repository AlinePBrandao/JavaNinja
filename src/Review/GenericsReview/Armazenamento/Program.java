package Review.GenericsReview.Armazenamento;

public class Program {
    public static void main(String[] args) {

        Warehouse<Product> productWarehouse = new Warehouse<>();
        Product lapis = new Product("Lápis", 2.50);
        Product caderno = new Product("Caderno", 12.00);
        Product mochila = new Product("Mochila", 89.90);

        productWarehouse.adicionarProduto(lapis);
        productWarehouse.adicionarProduto(caderno);
        productWarehouse.adicionarProduto(mochila);

        System.out.println("Itens no armazém: ");
        productWarehouse.listarProdutos();

        System.out.println();
        System.out.println("Buscando item no índice 1:");
        productWarehouse.buscarProduto(1);

        System.out.println();
        System.out.println("Quantidade atual: " +  productWarehouse.quantidadeProduto());

        System.out.println();
        System.out.println("Removendo: " + caderno.nome);
        productWarehouse.removerProduto(caderno);

        System.out.println();
        System.out.println("Quantidade após remoção: " + productWarehouse.quantidadeProduto());
        productWarehouse.listarProdutos();
    }
}
