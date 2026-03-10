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

        System.out.println("----FILTRADO POR VILA----");
        //NOTE: método filter filtra a lista recebendo o predicado e o dado referente
        ninjas.stream()
                .filter(ninjaDados -> ninjaDados.getVila().equalsIgnoreCase("konoha"))
                .forEach(System.out::println); //NOTE: soutc
        //NOTE: forEach() percorre todos os elementos do Stream e executa uma ação

        System.out.println("------------------------------");
        System.out.println("----ORDENADO POR IDADE----");
        //NOTE: método sort ordena a lista por comparação
        //NOTE n1 e n2 tem a funcao de se comparar entre si até que toda a lista tenha sido percorrida e toda ordenação feita
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("------------------------------");
        System.out.println("----PRIMEIRA FORMA DE ORDENAR POR NOME----");

        //NOTE: ordenar lista por nome
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        System.out.println("------------------------------");
        System.out.println("----SEGUNDA FORMA DE ORDENAR POR NOME----");

        //NOTE: Outra forma de ordenar por nome
        List<NinjaDados> ninjasOrdenados = ninjas.stream() //NOTE: converter a list para stream
                .sorted(Comparator.comparing(NinjaDados::getNome))
                .collect(Collectors.toList()); //NOTE: transforma o Stream novamente em List
        ninjasOrdenados.forEach(System.out::println);


        System.out.println("------------------------------");
        System.out.println("----MAPEANDO A LIST E RETORNANDO NOME----");
        //NOTE: Mapeando a Stram para ordenar lista por nome
        ninjas.stream()
                .map(NinjaDados::getNome)
                .forEach(System.out::println); //NOTE: printa apenas os nomes

//List<Ninja>
//   ↓
//stream()
//   ↓
//sorted (comparando pelo nome)
//   ↓
//collect → nova lista ordenada
    }
}
