package Review.RecordsReview;

import java.util.List;

public class Program {
    public static void main(String[] args) {

       CatalogoProdutos catalogo = new CatalogoProdutos();


       catalogo.exibirProdutos();

        System.out.println();
        System.out.println("Produto na Categoria Papelaria: ");
        List<Produto> papelaria = catalogo.buscarPorCategoria("Papelaria");
        for (Produto p : papelaria) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Produto Mais Caro: ");
        System.out.println(catalogo.produtoMaisCaro());

    }
}
