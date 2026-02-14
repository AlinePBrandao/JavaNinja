package Review.RecordsReview.Biblioteca;

public class Revista implements ItemBiblioteca{

    private String titulo;
    private int edicao;
    private String categoria;

    public Revista(String titulo, int edicao, String categoria){
        this.titulo = titulo;
        this.edicao = edicao;
        this.categoria = categoria;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String titulo() {
        return "";
    }

    @Override
    public String categoria() {
        return "";
    }

    @Override
    public String toString() {
        return "Revista[título= " + titulo + ", edição= " + edicao + ", categoria=" + categoria + "]";
    }
}
