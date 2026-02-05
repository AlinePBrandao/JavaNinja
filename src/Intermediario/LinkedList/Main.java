package Intermediario.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");
        System.out.println(linkedList); //NOTE: mostra os elementos da lista

        linkedList.add(1, "Kakashi Hatake"); //NOTE: adicionando passando o index
        System.out.println(linkedList);

        linkedList.remove(2); //NOTE: removendo passando o index
        System.out.println(linkedList);

        //NOTE: Classes e Interfaces que implementam Collections:
        //NOTE: Classes
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList1 = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        //NOTE: Interface
        Queue<String> queue = new LinkedList<>(); //Interface
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(); //Classe que implementa a interface queue
    }
}
