package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

public class Product {
    private String nome;
    private double preco;

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //NOTE: considerando dois produtos iguais mesmo com preços diferentes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;


    }
}
