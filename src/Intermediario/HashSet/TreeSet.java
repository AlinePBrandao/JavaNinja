package Intermediario.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {

        //NOTE: Elementos em ordem alfabética
        Set<String> ninjasSet = new java.util.TreeSet<>();
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        ninjasSet.add("Sakura Haruno");
        ninjasSet.add("Hinata Hyuga");
        ninjasSet.add("Kakashi Hatake");
        ninjasSet.add("Boruto Uzumaki");

        System.out.println(ninjasSet);


    }
}
