//interfaz genérica que define las operaciones básicas de una pila
public interface Stack<E> {
    //método para insertar un elemento en la pila
    void push(E x);

    //método para eliminar y devolver el elemento del tope
    E pop() throws ExceptionIsEmpty;

    //método para ver el elemento del tope sin eliminarlo
    E top() throws ExceptionIsEmpty;

    //método que indica si la pila está vacía
    boolean isEmpty();
}
