package Review.RecordsReview;

import java.util.List;

public class Program {
    public static void main(String[] args) {

       CatalogoProdutos catalogo = new CatalogoProdutos();

        catalogo.adicionarProduto(new Produto("Lapis", 1.0, "Papelaria", new Produto.Fabricante("Faber","Brasil")));
        catalogo.adicionarProduto(new Produto("Borracha", 0.5, "Papelaria", new Produto.Fabricante("Cis", "Colombia")));
        catalogo.adicionarProduto(new Produto("Tinta", 100.0, "Reforma e Construção", new Produto.Fabricante("Suvinil", "Brasil")));
        catalogo.adicionarProduto(new Produto("Ração para Cães", 200.0, "Animais", new Produto.Fabricante("Formula Natural", "França")));
        catalogo.adicionarProduto(new Produto("Esponja", 3.0, "Utilidades do Lar", new Produto.Fabricante("BomBril", "Colombia")));

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
