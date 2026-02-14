package Review.RecordsReview.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> itens = new ArrayList<>();

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

}
