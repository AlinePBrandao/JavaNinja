package Intermediario.Desafio6;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> linkedList = new LinkedList<>();

        linkedList.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        linkedList.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        linkedList.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        linkedList.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        linkedList.add(new Ninja("Gaara", 17, "Areia"));
        linkedList.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        linkedList.add(new Ninja("Temari", 18, "Areia"));

        System.out.println(linkedList);

        //TODO: remover o primeiro ninja
        linkedList.removeFirst();
        System.out.println();
        System.out.println(linkedList);

        //TODO: adicionar um novo ninja no início
        linkedList.addFirst(new Ninja("Hinata Hyuga", 17, "Konoha"));
        System.out.println();
        System.out.println(linkedList);

        //TODO: acessar um ninja em uma posição específica da lista
        linkedList.get(2);
        System.out.println();
        System.out.println(linkedList.get(2));
    }
}
