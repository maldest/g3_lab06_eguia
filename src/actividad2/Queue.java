package actividad2;


//creacion de la clase generica para la cola
public interface Queue<E>{
    void enqueue(E x); //metodo para agregar elementos a la col
    E dequeue() throws ExceptionIsEmpty; //elimina y devuelve el primer elemento
    E front() throws ExceptionIsEmpty;
    E back() throws ExceptionIsEmpty;
    boolean isEmpty();
    



}