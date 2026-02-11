package Review.GenericsReview;

public class Product{
    public String nome;
    public int preco;

    public Product(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " - R$ %.2f%n" + preco;
    }
}
