package Review.RecordsReview.Biblioteca;

public record Livro(String titulo, String autor, int paginas, String categoria) implements ItemBiblioteca {
    public Livro{
        if (titulo.isBlank()) throw new IllegalArgumentException("Titulo Inválido");
        if (autor.isBlank()) throw new IllegalArgumentException("Autor Inválido");
        if (paginas < 2) throw new IllegalArgumentException("Livro Incompleto");
        if (categoria.isBlank()) throw new IllegalArgumentException("Categoria Inválida");
    }
}
