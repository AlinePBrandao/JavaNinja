package Avançado.Streams;

import java.util.Comparator;

public class OrdernarPorNome implements Comparator<NinjaDados> {
    public int compare(NinjaDados nome1, NinjaDados nome2){
        return nome1.getNome().compareTo(nome2.getNome());
    }
}
