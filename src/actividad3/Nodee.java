package actividad3;

// Nodo para la lista enlazada, contiene el dato y el siguiente nodo
class Nodee<T> {
    private T data;  // Dato almacenado en el nodo
    private Nodee<T> next;  // Referencia al siguiente nodo

    // Constructor
    public Nodee(T data) {
        this.data = data;
        this.next = null;
    }

    // Getters y Setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodee<T> getNext() {
        return next;
    }

    public void setNext(Nodee<T> next) {
        this.next = next;
    }
}
