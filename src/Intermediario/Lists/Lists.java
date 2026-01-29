package Intermediario.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        //NOTE: Arrays são estáticos
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Array: " + ninjasArray[3]);

        //NOTE: Para visualizar todos os elementos do array
        for (int i = 0; i<ninjasArray.length; i++){
            System.out.println("ninjasArray[i] = " + ninjasArray[i]);
        }

        //NOTE: Lists são flexíveis
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sakura");
        ninjasList.add("Sasuke");
        ninjasList.add("Tobirama");
        ninjasList.add("Rinata");

        //NOTE: Para visualizar todos os elementos da list
        System.out.println("ninjasList = " + ninjasList);

        //NOTE: Para remover um elemento da list
        ninjasList.remove("Tobirama");
        System.out.println("ninjasList = " + ninjasList);

        //NOTE: Para trocar um elemento da list
        ninjasList.set(2, "Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        //NOTE: Para ver o tamanho da list
        System.out.println("Tamanho Lista = " + ninjasList.size() + " elementos");
    }
}
