package Intermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("0 Naruto Uzumaki");
        ninjas.add("1 Sasuke Uchiha");
        ninjas.add("2 Sakura Haruno");
        ninjas.add("3 Hinata Hyuga");
        System.out.println(ninjas);

        //NOTE: Convertendo List em Set
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        System.out.println(ninjasSet);

        //NOTE: Removendo elemento do Set
        ninjasSet.remove("0 Naruto Uzumaki");
        System.out.println(ninjasSet);

//        Set<String> ninjasSet = new HashSet<>();
//        ninjasSet.add("0 Naruto Uzumaki");
//        ninjasSet.add("1 Sasuke Uchiha");
//        ninjasSet.add("2 Sakura Haruno");
//        ninjasSet.add("3 Hinata Hyuga");
//        System.out.println(ninjasSet);

    }
}
