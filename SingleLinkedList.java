public class SingleLinkedList<E> {
    SingleLinkNode<E> head;
    SingleLinkNode<E> tail;
    int size;

    public void addLast(E element) { //add(E element)
        SingleLinkNode<E> newNode = new SingleLinkNode<>(element);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAtIdx(int idx, E element) { //add(int index, E element)
        SingleLinkNode<E> newNode = new SingleLinkNode<>(element);
        size++;
        int counter = 0;
        SingleLinkNode<E> current = head;

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            while (counter != (idx - 1)) {
                current = current.next;
                counter++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void remove(int idx) { //remove(int index)
        int counter = 0;
        SingleLinkNode<E> current = head;

        if (idx == 0) {
            head = head.next;
        } else {
            while (counter != (idx - 1)) {
                current = current.next;
                counter++;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public E getElement(int idx) {//get(int index)
        int counter = 0;
        SingleLinkNode<E> current = head;

        while (counter != idx) {
            current = current.next;
            counter++;
        }
        return current.value;

    }

    public void reverseList() {
        // TODO nach aufrufen der Methode ist die komplette Liste vertauscht
    }

    public void printList() {
        SingleLinkNode<E> current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        SingleLinkNode<E> current = head;
        while (current != null) {
            list.append(current.value);
            current = current.next;
        }
        return list.toString();
    }
}
