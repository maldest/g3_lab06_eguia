package Ejercicios;
//clase personalizada para lanzar una excepción cuando la pila está vacía
public class ExceptionIsEmpty extends Exception {
    //constructor que recibe un mensaje y lo pasa a la clase padre Exception
    public ExceptionIsEmpty(String msg) {
        super(msg);
    }
}
