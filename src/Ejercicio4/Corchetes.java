package Ejercicio4;

// Clase que resuelve el problema de los corchetes anidados
public class Corchetes {

    // Método estático que resuelve el problema de los corchetes anidados
    public static boolean symbolBalancing(String str) throws ExceptionIsEmpty {
        Stack<Character> stack = new StackLink<>();  // Usamos la pila para verificar los corchetes

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  // Obtenemos el carácter en la posición actual

            // Si el carácter es un corchete de apertura, lo apilamos
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Si es un corchete de cierre, verificamos si coincide con el de la cima de la pila
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    throw new ExceptionIsEmpty("Corchete de cierre sin apertura");  // Lanzamos la excepción si la pila está vacía
                }
                char top = stack.pop();  // Sacamos el corchete de la cima de la pila

                // Verificamos si los corchetes coinciden
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    throw new ExceptionIsEmpty("Corchetes no coinciden");  // Lanzamos la excepción si no coinciden
                }
            }
        }

        // Si la pila está vacía, significa que todos los corchetes fueron correctamente emparejados
        return stack.isEmpty();
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        String[] testStrings = {
            "()()()[()]()",   // Correcto
            "((()))[]",       // Correcto
            "([])[]((",       // Incorrecto
            "([{)]}",         // Incorrecto
            "[",              // Incorrecto
            "[][][]{{{}}}"    // Correcto
        };

        for (String s : testStrings) {
            try {
                // Llamada a la función symbolBalancing dentro de un bloque try-catch
                System.out.println("Cadena: " + s + " - ¿Está correctamente anidada? " + symbolBalancing(s));
            } catch (ExceptionIsEmpty e) {
                // Captura la excepción si la cadena no está correctamente anidada
                System.out.println("Cadena: " + s + " - Error: " + e.getMessage());
            }
        }
    }
}
