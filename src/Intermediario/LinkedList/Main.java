package Intermediario.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");
        System.out.println(linkedList); //NOTE: mostra os elementos da lista

        linkedList.add(1, "Kakashi Hatake"); //NOTE: adicionando passando o index
        System.out.println(linkedList);
    }
}
