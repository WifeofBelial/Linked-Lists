public class DoubleLinkNode<E> {
    E value;
    DoubleLinkNode<E> next;
    DoubleLinkNode<E> prev;

    DoubleLinkNode(E value){
        this.value = value;
        next = null;
        prev = null;
    }

}
