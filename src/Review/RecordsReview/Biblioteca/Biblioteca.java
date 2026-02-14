package Review.RecordsReview.Biblioteca;

import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> itens;

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

}
