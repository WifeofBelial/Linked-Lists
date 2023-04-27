import java.util.EmptyStackException;

public class Stack<E> {
    private DoubleLinkedList<Integer> stack;

    Stack() {
        stack = new DoubleLinkedList<>();
    }

    public void push(int number) {
        stack.addLast(number);
    }

    public Integer getSize() {
        return stack.getSize();
    }

    public Integer pop() {
        if (stack.getSize() <= 0) throw new EmptyStackException();
        return stack.remove(stack.getSize() - 1);
    }

    public Integer peek() {
        if (stack.getSize() <= 0) throw new EmptyStackException();
        return stack.getElement(stack.getSize() - 1);
    }

    public Integer[] pop(int count) {
        if (stack.getSize() <= 0) throw new EmptyStackException();
        Integer[] result = new Integer[count];
        for (int i = 0; i < count; i++) {
            result[i] = pop();
        }
        return result;
    }

    @Override
    public String toString() {
        return stack.toStringReverse();
    }
}
