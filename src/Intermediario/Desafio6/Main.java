package Intermediario.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listadeNinjas = new LinkedList<>();

        listadeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listadeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listadeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listadeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listadeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listadeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
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

        //TODO: ordenar a lista de ninjas por diferentes critérios: idade, nome ou vila
        //TODO: oferecer ao usuário a opção de escolher o critério de ordenação que reorganiza a lista
        //TODO: busque e retorne informações de um ninja com base no nome, utilizar um algoritmo de busca eficiente


    }
}
