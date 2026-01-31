package Intermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //NOTE: Array -> Estaticos e com ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki Array";
        System.out.println(ninjasArray[0]);

        //NOTE: Lists -> Dinamicas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki List");
        System.out.println(ninjasList);
        System.out.println();

        //NOTE: Stack -> O ultimo elemento a entrar é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();

        //NOTE: verificando lista vazia
        if (ninjaStack.isEmpty()){
            System.out.println("A pilha está vazia!");
            System.out.println();
        }

        //NOTE: adicionando elementos na lista
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Hinata");
        System.out.println("Minha Stack Atual: " + ninjaStack); //NOTE: verificando elementos na lista
        System.out.println("Tamanho da Stack é: " + ninjaStack.size() + " elementos"); //NOTE: tamanho da lista
        System.out.println();

        System.out.println("Meu último elemento é: " + ninjaStack.peek()); //NOTE: verificando ultimo elemento da lista
        System.out.println("Removendo último elemento: " + ninjaStack.pop()); //NOTE: removendo ultimo elemento da lista
        System.out.println();

        System.out.println("Minha Stack Atualizada: " + ninjaStack);
        System.out.println("Meu último elemento é: " + ninjaStack.peek());
        System.out.println("Tamanho da Stack é: " + ninjaStack.size() + " elementos");
    }
}
