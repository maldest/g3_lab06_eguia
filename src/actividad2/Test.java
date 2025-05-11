package actividad2;

public class Test {
    public static void main (String[] args) throws ExceptionIsEmpty{
                // Crear una cola de tipo Integer
        Queue<Integer> queue = new QueueLink<>();

        // Pruebas de enqueue (agregar elementos)
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Imprimir la cola después de agregar elementos
        System.out.println("Cola después de enqueue: " + queue);

        // Pruebas de front (ver el primer elemento)
        System.out.println("Primer elemento (front): " + queue.front());

        // Pruebas de back (ver el último elemento)
        System.out.println("Último elemento (back): " + queue.back());

        //pruebas de dequeue (eliminar el primer elemento)
        System.out.println("Elemento eliminado (dequeue): " + queue.dequeue());
        System.out.println("Cola después de dequeue: " + queue);

        //intentar hacer dequeue cuando la cola está vacía
        queue.dequeue(); // elimina 20
        queue.dequeue(); // elimina 30
        try {
            queue.dequeue(); // esta línea debe lanzar una excepción, ya que la cola está vacía
        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción lanzada: " + e.getMessage());
        }
    }
}

