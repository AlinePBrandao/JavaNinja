package Review.GenericsReview;

public class Warehouse {

    private String produto;

    public Warehouse(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String toString() {
        return produto;
    }
}
