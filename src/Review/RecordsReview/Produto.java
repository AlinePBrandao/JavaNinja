package Review.RecordsReview;

public record Produto(String nome, double preco, String categoria) {

    public Produto{
        //NOTE: isBlank(): verifica se uma string está vazia ou contém apenas caracteres de espaço em branco
        if (nome.isBlank()) throw new IllegalArgumentException("Nome Inválido");
        if (preco <= 0) throw new IllegalArgumentException("Preço Inválido");
        if (categoria.isBlank()) throw new IllegalArgumentException("Categoria Inválida");

    }
}
