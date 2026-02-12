package Desafios.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Ninja> listadeNinjas = new LinkedList<>();

        listadeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listadeNinjas.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        listadeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listadeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listadeNinjas.add(new Ninja("Gaara", 19, "Areia"));
        listadeNinjas.add(new Ninja("Shikamaru Nara", 18, "Konoha"));
        listadeNinjas.add(new Ninja("Temari", 18, "Areia"));

        //TODO: listar ninjas
        //System.out.println(listadeNinjas);

        //NOTE: Complexidade o(n) - é exponencial, quanto maior o tamanho da lista mais difícil de percorrer
        //NOTE: Percorre o objeto ninja na LinkedList
        for (Ninja ninja : listadeNinjas){
            System.out.println(ninja);
        }

        //TODO: remover o primeiro ninja
        Ninja ninjaRemovido = listadeNinjas.removeFirst();
        System.out.println();
        System.out.println("Ninja removido: " + ninjaRemovido);
        System.out.println(listadeNinjas);

        //TODO: adicionar um novo ninja no início
        listadeNinjas.addFirst(new Ninja("Hinata Hyuga", 17, "Konoha"));
        System.out.println();
        System.out.println(listadeNinjas);

        //TODO: acessar um ninja em uma posição específica da lista
        listadeNinjas.get(2);
        System.out.println();
        System.out.println(listadeNinjas.get(2));

    }
}
