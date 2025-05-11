package Ejercicio2;

// Clase de prueba para la cola
public class Test {
    public static void main(String[] args) {
        try {
            Queue<Integer> queue = new QueueArray<>(5);  // Crear una cola de enteros con capacidad 5

            queue.enqueue(10);  // Insertar 10
            queue.enqueue(20);  // Insertar 20
            queue.enqueue(30);  // Insertar 30

            System.out.println("Cola: " + queue);  // Imprimir la cola

            System.out.println("Frente: " + queue.front());  // Imprimir el primer elemento (10)
            System.out.println("Último: " + queue.back());  // Imprimir el último elemento (30)

            queue.dequeue();  // Eliminar el primer elemento (10)
            System.out.println("Cola después de dequeue: " + queue);  // Imprimir la cola

            queue.dequeue();  // Eliminar el siguiente elemento (20)
            System.out.println("Cola después de otro dequeue: " + queue);  // Imprimir la cola

            System.out.println("¿Está la cola vacía? " + queue.isEmpty());  // Verificar si la cola está vacía
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}
