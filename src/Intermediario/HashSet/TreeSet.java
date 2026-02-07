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

        //NOTE: Elementos em ordem de inserção
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.add("Naruto Uzumaki");
        ninjasLinkedHashSet.add("Sasuke Uchiha");
        ninjasLinkedHashSet.add("Sakura Haruno");
        ninjasLinkedHashSet.add("Hinata Hyuga");
        ninjasLinkedHashSet.add("Kakashi Hatake");
        ninjasLinkedHashSet.add("Boruto Uzumaki");

        System.out.println(ninjasLinkedHashSet);
    }
}
