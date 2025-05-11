package actividad2;

public class QueueLink <E> implements Queue<E> {
    private Node<E> first; // primer nodo (frente de la cola)
    private Node<E> last;  // último nodo (final de la cola)

    // Constructor, inicializa la cola vacía
    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x){ 
        Node<E> aux = new Node<E>(x); //crea un nuevo nodo
        if (this.isEmpty()){ //si la cola esta vacía
            this.first = aux; //el primer nodo será el nuevo
        } else{
            this.last.setNext(aux); //el último nodo apuntará a ser el nuevo nodo
        }
        this.last = aux; //actualiza el último nodo
    }
    
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("La cola está vacía"); //verifica si está vacía
        E value = first.getValue(); //toma el valor del primer nodo
        first = first.getNext(); //mueve el primer nodo al siguiente nodo
        if (first == null) last = null; //si la cola se queda vacía, el último también será null
        return value; //devuelve el valor del nodo eliminado
    }
    

    // Ver el primer elemento (sin eliminarlo)
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("La cola está vacía");
        return first.getValue(); // devolver el valor del primer nodo
    }

    // Ver el último elemento (sin eliminarlo)
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("La cola está vacía");
        return last.getValue(); // devolver el valor del último nodo
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return first == null; // si el primer nodo es null, la cola está vacía
    }

    // Mostrar la cola como una cadena
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = first; // empezar desde el primer nodo
        while (current != null) {
            sb.append(current.getValue()).append(" "); // agregar el valor de cada nodo
            current = current.getNext(); // mover al siguiente nodo
        }
        return sb.toString(); // devolver la representación de la cola
    }
}