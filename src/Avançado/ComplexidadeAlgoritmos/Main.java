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

        for (int i = 0; i < 100; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        //NOTE: verificando o numero no index
        incio = System.nanoTime(); //NOTE: tempo em nanosegundos
        arrayList.get(0);
        fim= System.nanoTime();
        tempo = fim - incio;
        System.out.println("Tempo Array List: " + tempo + " ns");

        //NOTE: verificando o numero no index
        incio = System.nanoTime();
        linkedList.get(0);
        fim= System.nanoTime();
        tempo = fim - incio;
        System.out.println("Tempo Linked List: " + tempo + " ns");
    }
}
