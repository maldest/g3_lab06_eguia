package Ejercicios;

public class Node<E> {
    E data; //almacenado de datos
    Node<E> next;

    //Constructor
    public Node (E data){
        this.data = data;
        this.next = null;  // Inicialmente no hay siguiente nodo
    }

}
