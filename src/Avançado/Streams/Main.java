package Avançado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<NinjaDados> ninjas = new ArrayList<>();
        ninjas.add(new NinjaDados("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new NinjaDados("Sasuke Uchiha", "Konoha", 19));
        ninjas.add(new NinjaDados("Sakura Haruno", "Konoha", 18));
        ninjas.add(new NinjaDados("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new NinjaDados("Gaara", "Suna", 20));
        ninjas.add(new NinjaDados("Temari", "Suna", 17));

        //NOTE: método filter filtra a lista recebendo o predicado e o dado referente
        ninjas.stream()
                .filter(ninjaDados -> ninjaDados.getVila().equals("Konoha"))
                .forEach(System.out::println); //NOTE: soutc

        //NOTE: método sort ordena a lista

    }
}
