package actividad3;

// Clase que implementa una cola de prioridad con lista enlazada ordenada
class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {
    private Nodee<EntryNode<E, N>> first; // Nodo que apunta al primer elemento de la cola (con mayor prioridad)
    private Nodee<EntryNode<E, N>> last;  // Nodo que apunta al último elemento de la cola (con menor prioridad)

    // Constructor de la cola de prioridad, inicializa la cola vacía
    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }

    // Método para agregar un elemento a la cola de prioridad, ordenado por prioridad
    public void enqueue(E x, N pr) {
        EntryNode<E, N> newEntry = new EntryNode<>(x, pr); // Crear un nuevo EntryNode con dato y prioridad
        Nodee<EntryNode<E, N>> newNode = new Nodee<>(newEntry); // Crear un nodo para la lista enlazada

        // Si la cola está vacía o el nuevo elemento tiene mayor prioridad que el primero
        if (isEmpty() || pr.compareTo(first.getData().priority) > 0) {
            newNode.setNext(first); // Insertar el nuevo nodo al principio de la lista
            first = newNode; // El nuevo nodo se convierte en el primer nodo

            // Si la cola estaba vacía, el último nodo también será el primer nodo
            if (last == null) last = newNode;
        } else {
            // Buscar la posición correcta para insertar el nuevo nodo según su prioridad
            Nodee<EntryNode<E, N>> current = first;
            while (current.getNext() != null && current.getNext().getData().priority.compareTo(pr) >= 0) {
                current = current.getNext(); // Avanzar al siguiente nodo
            }

            // Insertar el nuevo nodo en la posición correcta
            newNode.setNext(current.getNext());
            current.setNext(newNode);

            // Si el nuevo nodo es el último, actualizar el último nodo
            if (newNode.getNext() == null) last = newNode;
        }
    }

    // Método para eliminar y devolver el primer elemento (el de mayor prioridad)
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cannot remove from an empty queue");

        E aux = first.getData().data; // Obtener el dato del primer nodo
        first = first.getNext(); // Eliminar el primer nodo de la lista
        if (first == null) last = null; // Si la cola queda vacía, también se actualiza el último nodo
        return aux; // Devolver el dato del primer nodo eliminado
    }

    // Método para ver el primer elemento (el de mayor prioridad)
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("The queue is empty");
        return first.getData().data; // Retornar el dato del primer nodo
    }

    // Método para ver el último elemento (el de menor prioridad)
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("The queue is empty");
        return last.getData().data; // Retornar el dato del último nodo
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return first == null; // Si el primer nodo es null, la cola está vacía
    }

    // Mostrar la cola como una cadena
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Usar StringBuilder para eficiencia
        Nodee<EntryNode<E, N>> current = first; // Comenzar desde el primer nodo
        while (current != null) {
            sb.append(current.getData().data) // Agregar el dato del nodo
              .append(" (Priority: ")
              .append(current.getData().priority) // Agregar la prioridad del nodo
              .append(") -> ");
            current = current.getNext(); // Mover al siguiente nodo
        }
        return sb.toString(); // Devolver la representación en cadena de la cola
    }
}
