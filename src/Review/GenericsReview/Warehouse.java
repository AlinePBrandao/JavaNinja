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

    public void removerProduto(T produto){
        this.produto.remove(produto);
    }

    public void buscarProduto(int indiceProduto){
        this.produto.get(indiceProduto);
    }

    public int quantidadeProduto(){
        return produto.size();
    }

    public void listarProdutos(){
        for (T produto : this.produto){
            System.out.println(produto);
        }
    }



}
