package Review.RecordsReview;

import java.util.List;

public class CatalogoProdutos {

    List<Produto> produtos;

    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    List<Produto> buscarPorCategoria(String categoria){
        return produtos;
    }

    Produto produtoMaisCaro(){
        if (produtos.isEmpty()){
            return null;
        }
        //NOTE: ler do primeiro elemento
        Produto maisCaro = produtos.get(0);

        for (Produto p : produtos) {
            if (p.preco() > maisCaro.preco()){
                maisCaro = p;
            }
        }
        return maisCaro;
    }

    void exibirProdutos(){
        System.out.println("Produtos: " + produtos);
    }

}
