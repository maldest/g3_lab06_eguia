package Ejercicio4;

// Implementación de la pila usando una lista enlazada
public class StackLink<E> implements Stack<E> {
    private Node<E> top;  // Nodo superior de la pila

    // Constructor: Inicializa la pila vacía
    public StackLink() {
        top = null;
    }

    // Inserta un elemento en la cima de la pila
    @Override
    public void push(E x) {
        Node<E> newNode = new Node<>(x);
        newNode.next = top;
        top = newNode;
    }

    // Elimina y devuelve el elemento de la cima de la pila
    @Override
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        E value = top.data;
        top = top.next;
        return value;
    }

    // Devuelve el elemento de la cima sin eliminarlo
    @Override
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        return top.data;
    }

    // Verifica si la pila está vacía
    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
