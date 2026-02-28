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

    //NOTE: considera dois produtos iguais mesmo com preços diferentes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;

        //NOTE: Cast para Product
        Product other = (Product) obj;

        //NOTE: Considera igual se o nome for o mesmo
        return this.nome.equalsIgnoreCase(other.nome);
    }

    //NOTE: dados iguais tem o mesmo hashCode, retorna localização do objeto na memória
    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode();
    }
}
