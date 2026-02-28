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

    public double getPreco() {
        return preco;
    }

    //NOTE: considera dois produtos iguais pelo nome mesmo com preços diferentes
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

    public int compareTo(Product o){
        return this.nome.compareToIgnoreCase(o.nome);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", preço: R$" + preco;
    }
}
