package actividad3;

// Paquete por defecto
public class Test3 {
    public static void main(String[] args) throws ExceptionIsEmpty {
        // Crear una cola de prioridad con tipo Integer para el dato y Integer para la prioridad
        PriorityQueue<Integer, Integer> queue = new PriorityQueueLinkSort<>();

        // Agregar elementos con diferentes prioridades
        queue.enqueue(10, 2); // Dato: 10, Prioridad: 2
        queue.enqueue(20, 1); // Dato: 20, Prioridad: 1
        queue.enqueue(30, 3); // Dato: 30, Prioridad: 3

        // Imprimir la cola
        System.out.println("Cola de prioridad: " + queue);

        // Realizar operaciones de dequeue
        System.out.println("Elemento con mayor prioridad (dequeue): " + queue.dequeue());
        System.out.println("Cola después de dequeue: " + queue);

        // Ver el primer y último elemento
        System.out.println("Primer elemento (front): " + queue.front());
        System.out.println("Último elemento (back): " + queue.back());
    }
}
