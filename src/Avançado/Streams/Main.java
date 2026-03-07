package Avançado.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<NinjaDados> ninjas = new ArrayList<>();
        ninjas.add(new NinjaDados("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new NinjaDados("Sasuke Uchiha", "Konoha", 19));
        ninjas.add(new NinjaDados("Sakura Haruno", "Konoha", 18));
        ninjas.add(new NinjaDados("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new NinjaDados("Gaara", "Suna", 20));
        ninjas.add(new NinjaDados("Temari", "Suna", 17));
        ninjas.add(new NinjaDados("Rock Lee", "Suna", 35));

        //NOTE: método filter filtra a lista recebendo o predicado e o dado referente
        ninjas.stream()
                .filter(ninjaDados -> ninjaDados.getVila().equalsIgnoreCase("konoha"))
                .forEach(System.out::println); //NOTE: soutc
        //NOTE: forEach() percorre todos os elementos do Stream e executa uma ação
        System.out.println("------------------------------");

        //NOTE: método sort ordena a lista por comparação
        //NOTE n1 e n2 tem a funcao de se comparar entre si até que toda a lista tenha sido percorrida e toda ordenação feita
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("------------------------------");

        //NOTE: ordenar lista por nome
        List<NinjaDados> ninjasOrdenados = ninjas.stream() //NOTE: converter a list para stream
                .sorted(Comparator.comparing(NinjaDados::getNome))
                .collect(Collectors.toList()); //NOTE: transforma o Stream novamente em List
        ninjasOrdenados.forEach(System.out::println);

//List<Ninja>
//   ↓
//stream()
//   ↓
//sorted (comparando pelo nome)
//   ↓
//collect → nova lista ordenada
    }
}
