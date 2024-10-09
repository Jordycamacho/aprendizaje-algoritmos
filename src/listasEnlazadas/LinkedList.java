package listasEnlazadas;

public class LinkedList {
    
    Nodo head; //referencia siempre al primer nodo

    public void addNewNodo(int newNodo){
        Nodo nuevo = new Nodo(newNodo);

        if (head == null){
            head = nuevo;
        }else{
            Nodo actual = head;

            while (actual.next!=null) {
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }

    public void deleteNodo(int nodoToDelete){
        Nodo actual = head;
        Nodo anterior = null;

        if (actual != null && actual.data==nodoToDelete) {
            head = actual.next;
            return;
        }

        while (actual != null && actual.data !=nodoToDelete) {
            anterior=actual;
            actual = actual.next;
        }

        // Si no se encontró el valor
        if (actual==null) {
            return;
        }
        // Desenlazar el nodo (eliminar)
        anterior.next = actual.next;
    }

    public void display(){
        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.data + "->");
            actual =actual.next;
        }
        System.out.println("null");
    }
}
