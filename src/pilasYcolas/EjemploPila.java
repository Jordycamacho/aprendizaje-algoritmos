package pilasYcolas;

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        // Peek (ver el tope)
        System.out.println("Elemento en el tope: " + pila.peek());  // Output: 30
        

        System.out.println("Elemento eliminado: " + pila.pop());    // Output: 30
        System.out.println("Elemento eliminado: " + pila.pop());    // Output: 20
        
        System.out.println("¿Está vacía? " + pila.isEmpty());       // Output: false
    }
}

