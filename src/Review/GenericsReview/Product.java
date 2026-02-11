package Review.GenericsReview;

import java.util.List;

public class Product <T>{

    private List<T> produtos;

    public Product(List<T> produtos){
        this.produtos = produtos;
    }
    public List<T> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<T> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(T produto){
        produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Produtos: " +  produtos;
    }
}
