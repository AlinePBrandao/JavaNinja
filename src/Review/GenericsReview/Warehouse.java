package Review.GenericsReview;

import java.util.List;

public class Warehouse<T> {

    private List<T> produto;

    public Warehouse(List<T> produto) {
        this.produto = produto;
    }

    public List<T> getProduto() {
        return produto;
    }

    public void setProduto(List<T> produto) {
        this.produto = produto;
    }

    public void adicionarProduto(T produto){
        this.produto.add(produto);
    }



    @Override
    public String toString() {
        return "Produtos: " + produto;
    }


}
