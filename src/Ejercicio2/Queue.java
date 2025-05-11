package Ejercicio2;

public interface Queue<E> {
    void enqueue(E x);  // Inserta un elemento en la cola
    E dequeue() throws ExceptionIsEmpty;  // Elimina y devuelve el primer elemento
    E front() throws ExceptionIsEmpty;  // Devuelve el primer elemento sin eliminarlo
    E back() throws ExceptionIsEmpty;  // Devuelve el último elemento sin eliminarlo
    boolean isEmpty();  // Verifica si la cola está vacía
}