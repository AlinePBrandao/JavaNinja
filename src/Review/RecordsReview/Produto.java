package Review.RecordsReview;

public record Produto(String nome, double preco, String categoria, Fabricante fabricante) {

    //NOTE: validação no constructor compacto
    public Produto{
        //NOTE: isBlank(): verifica se uma string está vazia ou contém apenas caracteres de espaço em branco
        if (nome.isBlank()) throw new IllegalArgumentException("Nome Inválido");
        if (preco <= 0) throw new IllegalArgumentException("Preço Inválido");
        if (categoria.isBlank()) throw new IllegalArgumentException("Categoria Inválida");
    }

    public record Fabricante(String nomeFabricante, String pais){
        public Fabricante{
            if(nomeFabricante.isBlank()) throw new IllegalArgumentException("Nome do Fabricante Inválido");
            if(pais.isBlank()) throw new IllegalArgumentException("País Inválido");
        }
    }
}
