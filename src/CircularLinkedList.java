public class CircularLinkedList<T> {
    protected LLNode<T> first;
    protected LLNode<T> second;

    CircularLinkedList<T> list;



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
    public void showList() {
        LLNode<T> current = first.next; //so it doesn't include the dummy
        while (current != first) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void showReverseList() {
        showReverse(first.next);
    }
    public void showReverse(LLNode<T> current) {
        if (current == first) {
            return;
        }
        showReverse(current.next);
        System.out.print(current.data + " ");
    }

    public void find(T d) {
        LLNode<T> current = first.next;
        while (current != first) {
            if (current.data == d) {
                System.out.println("value found!");
                break;
            } else {
                current = current.next;
            }
        }
        if (current == first) {
            System.out.println("value not in list");
        }
    }

    public void remove(T d) {
        LLNode<T> previous = first;
        LLNode<T> current = first.next;
        while (current != first) {
            if (current.data == d) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    // addItem, showList, showReverseList, find, remove
}
