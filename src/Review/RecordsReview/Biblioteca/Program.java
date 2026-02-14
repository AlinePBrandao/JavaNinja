package Review.RecordsReview.Biblioteca;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarItem(new Livro("O Poderoso Chefão", "Mario Puzo", 600, "Ação"));
        biblioteca.adicionarItem(new Livro("A Hora da Estrela", "Clarice Lispector", 120, "Ficção"));
        biblioteca.adicionarItem(new Revista("Capricho", 27, "Variedades"));
        biblioteca.adicionarItem(new Revista("Turma da Mônica", 50, "Historia em Quadrinhos"));

        System.out.println("Itens Cadastrados: ");
        biblioteca.listarItens();

        System.out.println();
        System.out.println("Buscando item por Categoria: Ação");
        List<ItemBiblioteca> item = biblioteca.buscarPorCategoria("Ação");
        for (ItemBiblioteca encontrado : item) {
            System.out.println(encontrado);
        }


    }
}
