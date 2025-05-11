package Ejercicio3;

// Clase de prueba para la cola de prioridad
public class Test {
    public static void main(String[] args) {
        try {
            // Crear una cola de prioridad con 3 niveles de prioridad
            PriorityQueue<String, Integer> pq = new PriorityQueueLinked<>(3);

            // Agregar elementos con diferentes prioridades
            pq.enqueue("Elemento 1", 2);  // Prioridad 2
            pq.enqueue("Elemento 2", 0);  // Prioridad 0
            pq.enqueue("Elemento 3", 1);  // Prioridad 1

            // Imprimir los elementos en orden de prioridad
            System.out.println("Primer elemento (de mayor prioridad): " + pq.front());
            pq.dequeue();  // Eliminar el de mayor prioridad
            System.out.println("Después de eliminar el de mayor prioridad: " + pq.front());

            // Ver el último elemento
            System.out.println("Último elemento: " + pq.back());

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}
