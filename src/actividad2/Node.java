package actividad2;

public class Node<E> {
    private E value;
    private Node<E> next;

    // Constructor
    public Node(E value) {
        this.value = value;
        this.next = null;
    }

    // Getters y setters
    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}