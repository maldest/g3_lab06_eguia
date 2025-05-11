public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        Stack<Integer> pila = new StackArray<>(2); //crea una pila de tamaño 2

        /*pila.pop();*/ //esta línea si se ejecuta lanza excepción porque la pila está vacía

        pila.push(10); 
        pila.push(2);  
        

        System.out.println(pila); //muestra la pila: 

        pila.pop(); //elimina el tope (2)

        System.out.println(pila.top()); //muestra el nuevo tope: 10

        System.out.println(pila); //muestra la pila actual: 10
    }
}
