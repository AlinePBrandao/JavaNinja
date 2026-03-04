package Avançado.ComplexidadeAlgoritmos;

import java.util.ArrayList;

public class BigO {
    public static void main(String[] args) {

        ArrayList<Ninjas> ninjas = new ArrayList<>();

        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchihai", 17));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        //NOTE: Constante o(1), indenpendentemente de se ter 1 bilão de itens, a busca será pelo index, sendo assim
        //a busca será constante, não depende do tamanho da lista
        System.out.println(ninjas.get(2));

    }
}
