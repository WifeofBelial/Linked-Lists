public class DoubleLinkedList<E> {
    private DoubleLinkNode<E> head;
    private DoubleLinkNode<E> tail;
    private int size;

    public void addLast(E element) { //add(E element)
        DoubleLinkNode<E> newNode = new DoubleLinkNode<>(element);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtIdx(int idx, E element) {
        DoubleLinkNode<E> newNode = new DoubleLinkNode<>(element);
        int mid = size / 2;
        int counter = 0;
        DoubleLinkNode<E> current = head;

        if (idx == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (idx <= mid && idx > 0) {
            while (counter != (idx - 1)) {
                current = current.next;
                counter++;
            }
            newNode.next = current.next;
            current.next.prev = newNode.prev;
            newNode.next.prev = current.prev;
            current.next = newNode;
        } else if (idx == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            current = tail;
            counter = size;
            while (counter != (idx + 1)) {
                current = current.prev;
                counter--;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }

    public E remove(int idx) {
        int mid = size / 2;
        int counter = 0;
        DoubleLinkNode<E> current = head;

        if (idx == 0) {
            head = head.next;
        } else if (idx == (size - 1)) {
            current = tail;
            tail = tail.prev;
            tail.next = null;
        } else if (idx <= mid && idx > 0) {
            while (counter != (idx - 1)) {
                current = current.next;
                counter++;
            }
            current.next = current.next.next;
            current.next.prev = current.prev;
        } else {
            counter = size - 1;
            current = tail;
            while (counter != idx + 1) {
                current = current.prev;
                counter--;
            }
            current.prev = current.prev.prev;
            current.prev.next = current;
        }
        size--;

        return current.value;
    }

    public E getElement(int idx) {
        int mid = size / 2;
        int counter = 0;
        DoubleLinkNode<E> current = head;
        DoubleLinkNode<E> result;

        if (idx <= mid) {
            while (counter != idx) {
                current = current.next;
                counter++;
            }
            result = current;
        } else {
            counter = size - 1;
            current = tail;
            while (counter != idx) {
                current = current.prev;
                counter--;
            }
            result = current;
        }
        return result.value;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        DoubleLinkNode<E> current = head;
        while (current != null) {
            list.append(current.value).append(" ");
            current = current.next;
        }
        return list.toString();
    }

    //@Override
    public String toStringReverse() {
        StringBuilder list = new StringBuilder();
        DoubleLinkNode<E> current = tail;
        while (current != null) {
            list.append(current.value).append(" ");
            current = current.prev;
        }
        return list.toString();
    }
}
