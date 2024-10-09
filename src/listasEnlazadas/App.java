package listasEnlazadas;

public class App {
    public static void main(String[] args) {
        // Creamos un nuevo nodo
        LinkedList lista = new LinkedList();

        lista.addNewNodo(1);
        lista.addNewNodo(2);
        lista.addNewNodo(3);
        lista.addNewNodo(4);
        lista.addNewNodo(5);

        System.out.println("Lista completa");
        lista.display();

        lista.deleteNodo(3);
        System.out.println("Lista después de eliminar el nodo 3");
        lista.display();
    }
}
