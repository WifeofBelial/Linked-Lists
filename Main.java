import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SingleLinkedList<Integer> llist = new SingleLinkedList<>();
//
//        llist.addLast(1);
//        llist.addLast(10);
//        llist.addLast(20);
//        llist.addLast(30);
//        llist.addLast(40);
//        llist.addAtIdx(1,8);
//        llist.remove(2);
//
//
//        System.out.print("Elements of the list: ");
//        llist.printList();
//        System.out.println();
//
//
//        System.out.print("Value at given Index is: " );
//        System.out.println(llist.getElement(2));
//        System.out.print("List contains: ");
//        System.out.print(llist.getSize());
//        System.out.println(" elements.");
//
//        DoubleLinkedList<Integer> dlist = new DoubleLinkedList<>();
//
//        dlist.addLast(5);
//        dlist.addLast(10);
//        dlist.addLast(15);
//        dlist.addLast(20);
//        dlist.addLast(25);
//        dlist.addAtIdx(4, 22);
//        System.out.println(dlist);
//        dlist.remove(5);
//        System.out.println(dlist);
//
//        System.out.println(dlist.getSize());
//        System.out.println(dlist.getElement(1));
//
//        System.out.println(dlist.toStringReverse());
//
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        stack.push(20);
//        stack.push(25);
//
//        System.out.println(stack.peek());
//        System.out.println(stack.getSize());
//        System.out.println(stack);
//        System.out.println();
//
//        System.out.println(stack.pop());
//        System.out.println(stack.getSize());
//        System.out.println(stack);
//        System.out.println();
//
//        stack.push(25);
//        stack.push(30);
//        stack.push(35);
//        System.out.println(stack.getSize());
//        System.out.println(stack);
//        Integer[] result = stack.pop(4);
//        System.out.println(Arrays.toString(result));
//        System.out.println(stack);

        Queue<Integer> queue = new Queue<>();

        queue.push(5);
        queue.push(10);
        queue.push(15);
        queue.push(20);
        queue.push(25);

        System.out.println(queue);

        System.out.println(queue.getSize());

        System.out.println(queue.dequeue());
        System.out.println(queue);

        queue.push(30);
        queue.push(35);
        System.out.println(queue);
        Integer[] result = queue.dequeue(3);
        System.out.println(Arrays.toString(result));

        System.out.println(queue);
//
    }
}