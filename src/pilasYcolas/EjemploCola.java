package pilasYcolas;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        cola.add(10);
        cola.add(20);
        cola.add(30);
        
        System.out.println("Elemento al frente: " + cola.peek());  // Output: 10
        
        System.out.println("Elemento eliminado: " + cola.poll());  // Output: 10
        System.out.println("Elemento eliminado: " + cola.poll());  // Output: 20
        
        System.out.println("¿Está vacía? " + cola.isEmpty());      // Output: false
    }
}

