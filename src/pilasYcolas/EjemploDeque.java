package pilasYcolas;

import java.util.ArrayDeque;
import java.util.Deque;

/*
  Una Deque (Double-Ended Queue) permite agregar o eliminar elementos tanto desde el inicio 
  como desde el final. Esto es útil cuando necesitas flexibilidad tanto en LIFO como en FIFO. 
*/

public class EjemploDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Agregar al inicio y al final
        deque.addFirst(10);
        deque.addLast(20);
        
        // Eliminar desde ambos extremos
        System.out.println(deque.removeFirst());  // Output: 10
        System.out.println(deque.removeLast());   // Output: 20
    }
}

