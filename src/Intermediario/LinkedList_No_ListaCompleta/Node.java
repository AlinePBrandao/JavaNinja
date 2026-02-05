package Intermediario.LinkedList_No_ListaCompleta;

public class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
