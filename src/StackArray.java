//clase que implementa una pila usando un arreglo genérico
public class StackArray<E> implements Stack<E> {
    private E[] array; //arreglo donde se almacenan los elementos de la pila
    private int tope;  //índice del último elemento insertado

    //constructor que inicializa el arreglo con tamaño n y pone tope en -1
    public StackArray(int n) {
        array = (E[]) new Object[n]; //cast porque no se puede crear arreglo genérico directo
        tope = -1; //inicialmente la pila está vacía
    }

    //método para insertar un elemento en la pila
    public void push(E x) {
        if (isFull()) throw new RuntimeException("pila llena"); //lanzamos error si no hay espacio
        array[++tope] = x; //primero aumenta tope, luego guarda el elemento
    }

    //método para eliminar y devolver el elemento en el tope
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Pila esta vacia"); //verifica si está vacía
        return array[tope--]; //devuelve el tope y luego lo reduce
    }

    //método para ver el tope sin eliminarlo
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Pila esta vacia"); //verifica si está vacía
        return array[tope]; //devuelve el valor en el tope
    }

    //método que dice si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    //método que dice si la pila ya está llena (no se usa en el test)
    public boolean isFull() {
        return tope == array.length - 1;
    }

    //convierte el contenido de la pila en una cadena para mostrarla
    public String toString() {
        StringBuilder sb = new StringBuilder(); //permite construir el texto fácilmente
        for (int i = tope; i >= 0; i--) { //va del tope hacia abajo
            sb.append(array[i]).append(" "); //agrega cada elemento separado por espacio
        }
        return sb.toString(); //retorna la cadena final
    }
}
