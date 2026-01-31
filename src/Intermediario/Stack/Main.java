package Intermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //NOTE: Array -> Estaticos e com ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        //NOTE: Lists -> Dinamicas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        //NOTE: Stack -> O ultimo elemento a entrar é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Hinata");
        System.out.println("Minha Stack Atual: " + ninjaStack);
        System.out.println("Tamanho da Stack é: " + ninjaStack.size() + " elementos");
        System.out.println();

        System.out.println("Meu último elemento é: " + ninjaStack.peek());
        System.out.println("Removendo último elemento: " + ninjaStack.pop());
        System.out.println();

        System.out.println("Minha Stack Atualizada: " + ninjaStack);
        System.out.println("Meu último elemento é: " + ninjaStack.peek());
        System.out.println("Tamanho da Stack é: " + ninjaStack.size() + " elementos");
    }
}
