package Ejercicios;

// Paquete: ejercicio1

// Implementación de la pila con lista enlazada
public class StackLink<E> implements Stack<E> {
    private Node<E> top;  // Referencia al nodo superior (cima de la pila)

    // Constructor: Inicializa la pila vacía
    public StackLink() {
        top = null;  // La pila está vacía al principio
    }

    // Inserta un elemento en la cima de la pila
    @Override
    public void push(E x) {
        Node<E> newNode = new Node<>(x);  // Crear un nuevo nodo
        newNode.next = top;  // El siguiente nodo será el que estaba en la cima
        top = newNode;  // El nuevo nodo se convierte en la cima
    }

    // Elimina y devuelve el elemento de la cima de la pila
    @Override
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");  // Si está vacía, lanza excepción
        }

        E value = top.data;  // Obtener el dato de la cima
        top = top.next;  // Mover la cima al siguiente nodo
        return value;  // Devolver el dato
    }

    // Devuelve el elemento en la cima de la pila sin eliminarlo
    @Override
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");  // Si está vacía, lanza excepción
        }

        return top.data;  // Devolver el dato de la cima
    }

    // Verifica si la pila está vacía
    @Override
    public boolean isEmpty() {
        return top == null;  // Si la cima es null, la pila está vacía
    }
}
