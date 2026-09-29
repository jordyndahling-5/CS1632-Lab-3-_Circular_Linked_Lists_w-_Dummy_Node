public class CircularLinkedList<T> {
    protected LLNode<T> first;
    protected LLNode<T> second;



    public CircularLinkedList() {
        LLNode<T> dummy = new LLNode<T>(null, null);
        first = dummy;
        dummy.next = dummy;
    }
    public LLNode<T> getFirst() {
        return first;
    }
    public void addItem(T d) {
        second = new LLNode<T>(d, first.next);
        first.next = second;
    }

    // addItem, showList, showReverseList, find, remove
}
