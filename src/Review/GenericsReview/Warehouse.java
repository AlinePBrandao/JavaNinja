package Review.GenericsReview;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {

    private List<T> produto;

    public Warehouse() {
        this.produto =  new ArrayList<>();
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
        System.out.println("Produto: " + produto);
    }

    public void buscarProduto(int indiceProduto){
        System.out.println(produto.get(indiceProduto));
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
