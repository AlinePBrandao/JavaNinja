package Review.RecordsReview;

import java.util.List;

public class Program {
    public static void main(String[] args) {

       CatalogoProdutos catalogo = new CatalogoProdutos();

       catalogo.adicionarProduto(new Produto("Lapis", 1.0, "Papelaria"));
       catalogo.adicionarProduto(new Produto("Borracha", 0.5, "Papelaria"));
       catalogo.adicionarProduto(new Produto("Tinta", 100.0, "Reforma e Construção"));
       catalogo.adicionarProduto(new Produto("Ração para Cães", 200.0, "Animais"));
       catalogo.adicionarProduto(new Produto("Esponja", 3.0, "Utilidades do Lar"));

       catalogo.exibirProdutos();

        System.out.println();
        System.out.println("Produto na Categoria Papelaria: ");
        List<Produto> papelaria = catalogo.buscarPorCategoria("Papelaria");
        for (Produto p : papelaria) {
            System.out.println(p);
        }

    }
}
