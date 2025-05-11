package actividad3; //paquete actividad3

// Interfaz genérica para la cola de prioridad
public interface PriorityQueue<E, N> {
    // Encolar un elemento con una prioridad
    void enqueue(E x, N pr);

    // Desencolar el primer elemento
    E dequeue() throws ExceptionIsEmpty;

    // Ver el primer elemento (el de mayor prioridad)
    E front() throws ExceptionIsEmpty;

    // Ver el último elemento (el de menor prioridad)
    E back() throws ExceptionIsEmpty;

    // Verificar si la cola está vacía
    boolean isEmpty();

    // Mostrar los elementos de la cola como una cadena
    String toString();
}
