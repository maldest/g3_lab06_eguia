package Ejercicio4;

// Clase Nodo para la pila
class Node<E> {
    E data;  // Dato almacenado en el nodo
    Node<E> next;  // Referencia al siguiente nodo

    // Constructor
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
