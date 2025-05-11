package Ejercicio3;

// Paquete: ejercicio3

// Interfaz genérica para la cola de prioridad
public interface PriorityQueue<E, N> {
    void enqueue(E x, N pr);  // Inserta un elemento con una prioridad
    E dequeue() throws ExceptionIsEmpty;  // Elimina y devuelve el elemento de mayor prioridad
    E front() throws ExceptionIsEmpty;  // Devuelve el primer elemento sin eliminarlo
    E back() throws ExceptionIsEmpty;  // Devuelve el último elemento sin eliminarlo
    boolean isEmpty();  // Verifica si la cola está vacía
}
