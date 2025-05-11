package Ejercicio4;  // Asegúrate de que el paquete sea correcto

// Interfaz para la pila
public interface Stack<E> {
    void push(E x);  // Inserta un elemento en la pila
    E pop() throws ExceptionIsEmpty;  // Elimina y devuelve el elemento de la cima
    E top() throws ExceptionIsEmpty;  // Devuelve el elemento de la cima sin eliminarlo
    boolean isEmpty();  // Verifica si la pila está vacía
}
