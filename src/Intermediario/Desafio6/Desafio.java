package Intermediario.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Desafio {
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

        //TODO: oferecer ao usuário a opção de escolher o critério de ordenação que reorganiza a lista
        System.out.println("Menu de Opções para Ordenação");
        System.out.println("Como deseja ordenar essa lista?");
        System.out.println("1- Nome");
        System.out.println("2- Idade");
        System.out.println("3- Aldeia");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        //TODO: ordenar a lista de ninjas por diferentes critérios: idade, nome ou vila

        switch (opcao){
            case 1:
                listadeNinjas.sort(Comparator.comparing(Ninja::getNome));
                System.out.println("---------------Ordenação por Nome---------------");
                System.out.println(listadeNinjas);
                break;
            case 2:
                listadeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                System.out.println("---------------Ordenação por Idade---------------");
                System.out.println(listadeNinjas);
                break;
            case 3:
                listadeNinjas.sort(Comparator.comparing(Ninja::getVila));
                System.out.println("---------------Ordenação por Vila---------------");
                System.out.println(listadeNinjas);
                break;
        }


        //TODO: busque e retorne informações de um ninja com base no nome, utilizar um algoritmo de busca eficiente

        sc.close();
    }
}
