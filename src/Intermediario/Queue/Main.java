package Intermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //NOTE: Queue -> O primeiro elemento a entrar é o primeiro a sair
        Queue<String> ninjasQueue = new LinkedList<>();

        //NOTE: adicionando elementos na fila
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaro");

        //NOTE: acessando elementos da fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        //NOTE: acessando quantidade de elementos da fila
        System.out.println("Tamanho da Fila é: " + ninjasQueue.size() + " elementos");
        System.out.println();

        //NOTE: removendo elementos da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila atualizada: " + ninjasQueue);

        //NOTE: verificando o primeiro elemento da fila
        System.out.println("Ninja Head: " + ninjasQueue.peek());
        System.out.println();

        //NOTE: não é possível deletar o tail (último da fila), obrigatório atender a fila

        //NOTE: esvaziando a fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila atualizada: " + ninjasQueue);
        ninjasQueue.poll();

        //NOTE: verificar se a fila está vazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia!");
        }
    }
}
