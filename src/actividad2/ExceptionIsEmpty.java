package actividad2;

public class ExceptionIsEmpty extends Exception {
    //constructor que recibe un mensaje y lo pasa a la clase padre Exception
    public ExceptionIsEmpty(String msg) {
        super(msg);
    }
}
