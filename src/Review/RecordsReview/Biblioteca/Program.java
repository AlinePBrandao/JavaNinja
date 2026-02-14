package Review.RecordsReview.Biblioteca;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarItem(new Livro("O Poderoso Chefão",  600, "Ação", new Livro.Autor("Mario Puzo", "Italiano")));
        biblioteca.adicionarItem(new Livro("A Hora da Estrela", 120, "Ficção", new Livro.Autor("Clarice Lispector", "Brasileira")));
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

        System.out.println();
        System.out.println("Buscando item por Título: Turma da Mônica");
        List<ItemBiblioteca> itemTitulo = biblioteca.buscarPorTitulo("Turma da Mônica");
        for (ItemBiblioteca tituloEncontrado : itemTitulo) {
            System.out.println(tituloEncontrado);
        }
    }
}
