package Intermediario.Desafio6;

//NOTE: Armazena qualquer tipo de dado
public class LinkedList<T> {
    private Node<T> head;

    public void add(T elemento){
        Node<T> newElement = new Node<>(elemento);

        if (head == null){
            head = newElement;
        } else {
            Node<T> atual = head;
            while (atual.next!= null){
                atual = atual.next;
            }
            atual.next = newElement;
        }
    }
    public void printList(){
        Node<T> atual = head;
        while (atual != null){
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}
