package Review.RecordsReview.Catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoProdutos {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public List<Produto> buscarPorCategoria(String categoria){
        List<Produto> encontrado = new ArrayList<>();

        for (Produto p : produtos){
            if (p.categoria().equalsIgnoreCase(categoria)) {
                encontrado.add(p);
            }
        }
        return encontrado;
    }

    public Produto produtoMaisCaro(){
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

    public List<Produto> buscarPorPais(String pais){
        List<Produto> paisEncontrado = new ArrayList<>();

        for (Produto f : produtos){
            if (f.fabricante().pais().equalsIgnoreCase(pais)){
                paisEncontrado.add(f);
            }
        }    return paisEncontrado;
    }

    void exibirProdutos(){
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
