package Ejercicio2;

// Implementación de la cola con arreglo
public class QueueArray<E> implements Queue<E> {
    private E[] array;  // Arreglo para almacenar los elementos de la cola
    private int front;  // Índice del primer elemento
    private int back;   // Índice del último elemento
    private int size;   // Número actual de elementos en la cola
    private int capacity; // Capacidad máxima del arreglo

    // Constructor: inicializa la cola con el tamaño máximo dado
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.array = (E[]) new Object[capacity];  // Crea el arreglo con el tamaño dado
        this.front = 0;  // Inicialmente el frente está en el índice 0
        this.back = -1;  // Inicialmente no hay elementos en la cola
        this.size = 0;   // Inicialmente la cola está vacía
    }

    // Inserta un elemento en la cola
    @Override
    public void enqueue(E x) {
        if (size == capacity) {
            throw new RuntimeException("Cola llena");  // Si la cola está llena, no podemos insertar más
        }

        back = (back + 1) % capacity;  // Incrementamos el índice de "back" de forma modular
        array[back] = x;  // Insertamos el nuevo elemento
        size++;  // Aumentamos el tamaño de la cola
    }

    // Elimina y devuelve el primer elemento de la cola
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");  // Si la cola está vacía, lanzamos una excepción
        }

        E aux = array[front];  // Obtenemos el primer elemento
        front = (front + 1) % capacity;  // Incrementamos el índice de "front" de forma modular
        size--;  // Disminuimos el tamaño de la cola
        return aux;  // Devolvemos el primer elemento
    }

    // Devuelve el primer elemento de la cola sin eliminarlo
    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return array[front];  // Retornamos el primer elemento
    }

    // Devuelve el último elemento de la cola sin eliminarlo
    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return array[back];  // Retornamos el último elemento
    }

    // Verifica si la cola está vacía
    @Override
    public boolean isEmpty() {
        return size == 0;  // Si el tamaño es 0, la cola está vacía
    }

    // Representación en cadena de la cola
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[(front + i) % capacity]).append(" ");  // Usamos la aritmética modular para acceder a los elementos
        }
        return sb.toString().trim();  // Convertimos el contenido en una cadena
    }
}
