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

        System.out.println("----------------------");

        //NOTE: Linear o(n), depende do tamanho da lista, quanto maior mais complexa.
        //NOTE: dica: se tiver uma lista pra percorrer e provavelmente vai demorar = complexidade linear
        for (Ninjas ninja : ninjas){
            System.out.println(ninja);
        }

        System.out.println("----------------------");

        //NOTE: quadratica o(n²)
        //NOTE: percorrendo com 2 ponteiros - mested loop ou loop encadeado
        for (int i = 0; i < ninjas.size(); i++ ){
            for (int j = 0; j < ninjas.size(); j++){
                System.out.println(ninjas.get(i) + "vs" + ninjas.get(j));
            }
        }
    }
}
