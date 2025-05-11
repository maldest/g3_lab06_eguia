package actividad2;

public class QueueLink {
    private Node<E> first; // primer nodo (frente de la cola)
    private Node<E> last;  // último nodo (final de la cola)

    // Constructor, inicializa la cola vacía
    public QueueLink() {
        this.first = null;
        this.last = null;
    }
    
    public void enqueue(E x){
        Node<E> aux = new Node<E>(x);
        if (this.isEmpty()){
            this.first = aux;
        } else{
            this.last.setNext(aux);
        }
        this.last = aux;
    }

    




}