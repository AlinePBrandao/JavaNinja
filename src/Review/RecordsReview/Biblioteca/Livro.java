package Review.RecordsReview.Biblioteca;

public record Livro(String titulo, int paginas, String categoria, Autor autor) implements ItemBiblioteca {
    public record Autor(String nome, String nacionalidade){
        public Autor{
            if (nome.isBlank()) throw new IllegalArgumentException("Autor Inválido");
            if (nacionalidade.isBlank()) throw new IllegalArgumentException("Autor Inválido");
        }
    }

    public Livro{
        if (titulo.isBlank()) throw new IllegalArgumentException("Titulo Inválido");
        if (paginas < 2) throw new IllegalArgumentException("Livro Incompleto");
        if (categoria.isBlank()) throw new IllegalArgumentException("Categoria Inválida");
    }
}
