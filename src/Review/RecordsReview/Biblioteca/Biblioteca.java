package Review.RecordsReview.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> itens = new ArrayList<>();

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

    public List<ItemBiblioteca> buscarPorCategoria(String categoria){
        List<ItemBiblioteca> categoriaEncontrada = new ArrayList<>();

        for (ItemBiblioteca item : itens){
            if (item.categoria().equalsIgnoreCase(categoria)){
                categoriaEncontrada.add(item);
            }
        }
        return categoriaEncontrada;
    }

    public List<ItemBiblioteca> buscarPorTitulo(String titulo){
        List<ItemBiblioteca> tituloEncontrado = new ArrayList<>();

        for (ItemBiblioteca item : itens){
            if (item.titulo().equalsIgnoreCase(titulo)){
                tituloEncontrado.add(item);
            }
        }
        return tituloEncontrado;
    }

    public void listarItens(){
        for (ItemBiblioteca item : itens){
            System.out.println(item);
        }
    }
}
