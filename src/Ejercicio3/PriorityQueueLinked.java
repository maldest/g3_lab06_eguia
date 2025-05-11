package Ejercicio3;

// Implementación de una cola de prioridad usando varias colas enlazadas
public class PriorityQueueLinked<E, N extends Comparable<N>> implements PriorityQueue<E, N> {
    private QueueLink<E> [] queues;  // Arreglo de colas, una para cada nivel de prioridad
    private int numPriorities;  // Número de niveles de prioridad

    // Constructor: recibe el número de prioridades posibles
    public PriorityQueueLinked(int numPriorities) {
        this.numPriorities = numPriorities;
        queues = new QueueLink[numPriorities];  // Crear el arreglo de colas
        for (int i = 0; i < numPriorities; i++) {
            queues[i] = new QueueLink<>();  // Inicializar cada cola
        }
    }

    // Método para agregar un elemento con una prioridad a la cola de prioridad
    @Override
    public void enqueue(E x, N pr) {
        int priorityIndex = (Integer) pr; // Convertimos la prioridad en un índice para el arreglo de colas
        if (priorityIndex >= 0 && priorityIndex < numPriorities) {
            queues[priorityIndex].enqueue(x);  // Insertar el elemento en la cola correspondiente a su prioridad
        } else {
            throw new IllegalArgumentException("Prioridad fuera de rango");
        }
    }

    // Método para eliminar y devolver el elemento de mayor prioridad
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        // Buscar la cola con la prioridad más alta que tenga elementos
        for (int i = 0; i < numPriorities; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue();  // Devolver el primer elemento de la cola con mayor prioridad
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía");
    }

    // Método para ver el primer elemento de la cola sin eliminarlo
    @Override
    public E front() throws ExceptionIsEmpty {
        // Buscar la cola con la prioridad más alta que tenga elementos
        for (int i = 0; i < numPriorities; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].front();  // Devolver el primer elemento de la cola con mayor prioridad
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía");
    }

    // Método para ver el último elemento de la cola sin eliminarlo
    @Override
    public E back() throws ExceptionIsEmpty {
        // Buscar la cola con la prioridad más baja que tenga elementos
        for (int i = numPriorities - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                return queues[i].back();  // Devolver el último elemento de la cola con mayor prioridad
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía");
    }

    // Verificar si la cola está vacía
    @Override
    public boolean isEmpty() {
        // Verificar si todas las colas están vacías
        for (int i = 0; i < numPriorities; i++) {
            if (!queues[i].isEmpty()) {
                return false;  // Si alguna cola tiene elementos, la cola de prioridad no está vacía
            }
        }
        return true;  // Si todas las colas están vacías, la cola de prioridad está vacía
    }
}
