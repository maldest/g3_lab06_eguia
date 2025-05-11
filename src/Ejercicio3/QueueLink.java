package Ejercicio3;


// Implementación de una cola utilizando lista enlazada
class QueueLink<E> {
    private Node<E> first;  // Primer nodo
    private Node<E> last;   // Último nodo

    public QueueLink() {
        first = null;
        last = null;
    }

    // Método para insertar un elemento al final de la cola
    public void enqueue(E x) {
        Node<E> newNode = new Node<>(x);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
    }

    // Método para eliminar y devolver el primer elemento de la cola
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        E value = first.getData();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        return value;
    }

    // Método para ver el primer elemento sin eliminarlo
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return first.getData();
    }

    // Método para ver el último elemento sin eliminarlo
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return last.getData();
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return first == null;
    }
}
