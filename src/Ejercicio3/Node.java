package Ejercicio3;

// Clase Nodo para la lista enlazada
class Node<E> {
    private E data;  // Dato almacenado en el nodo
    private Node<E> next;  // Referencia al siguiente nodo

    // Constructor
    public Node(E data) {
        this.data = data;
        this.next = null;  // Inicialmente no hay siguiente nodo
    }

    // Getters y Setters
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
