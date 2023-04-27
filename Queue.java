public class Queue<E> {
    private DoubleLinkedList<Integer> queue;

    Queue() {
        queue = new DoubleLinkedList<>();
    }

    public void push(int number) {
        queue.addLast(number);
    }

    public Integer getSize() {
        return queue.getSize();
    }

    public Integer dequeue() {
        if (queue.getSize() <= 0)
            throw new IndexOutOfBoundsException("The queue is empty!");
        return queue.remove(0);
    }

    public Integer[] dequeue(int count) {
        if (queue.getSize() <= 0)
            throw new IndexOutOfBoundsException("The queue is empty!");
        Integer[] result = new Integer[count];
        for (int i = 0; i < count; i++) {
            result[i] = dequeue();
        }
        return result;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
