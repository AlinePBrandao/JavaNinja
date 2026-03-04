package Avançado.ComplexidadeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long incio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //NOTE: Algoritmo complexidade O(n) - depende do tamanho da lista
        for (int i = 0; i < 2900500; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        //NOTE: classificao O(n) - Complexidade Linear: a complexidade se altera de acordo com o tamanho do arrayList,
        // quanto maior a list, mais tempo necessario para realizar operacoes
        incio = System.nanoTime(); //NOTE: tempo em nanosegundos
        arrayList.remove(250);
        fim= System.nanoTime();
        tempo = fim - incio;
        System.out.println("Tempo Array List: " + tempo + " ns");

        //NOTE: classificacao O(1) - Complexidade Constante: independente do numero de opracoes ou elementos, a complexidade
        // se mantem a mesma
        incio = System.nanoTime();
        linkedList.remove(250);
        fim= System.nanoTime();
        tempo = fim - incio;
        System.out.println("Tempo Linked List: " + tempo + " ns");
    }
}
