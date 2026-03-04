package Avançado.ComplexidadeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long incio = System.nanoTime(); //NOTE: tempo em nanosegundos
        long fim= System.nanoTime();
        long tempo = fim - incio;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        //NOTE: verificando o numero no index
        arrayList.get(0);

        //NOTE: verificando o numero no index
        linkedList.get(0);
    }
}
