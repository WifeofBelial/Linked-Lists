public class SingleLinkNode<E> {
    E value; // Wert der in der Node gespeichert ist!
    SingleLinkNode<E> next;// Pointer!

    SingleLinkNode(E value) { // Konstruktor! -> generiert eine einzelne Node ohne Nachbarn - deshalb next = null wil kein Nachbar vorhanden
        this.value = value;
        next = null;
    }
}
