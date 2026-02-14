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
}
