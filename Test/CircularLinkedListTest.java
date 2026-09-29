import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircularLinkedListTest<T> {

    @Test
    void getFirst() {
        CircularLinkedList<T> list = new CircularLinkedList<T>();

        assertNotNull(list.getFirst()); //node is there
        assertNull(list.getFirst().getData()); //data in dummy is null
    }

    @Test
    void addItem() {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.addItem(4); //should be after 5
        list.addItem(5); //should be before 4

        assertEquals(Integer.valueOf(5), list.getFirst().next.data);
        assertEquals(Integer.valueOf(4), list.getFirst().next.next.data); //next.next means it will be after 5
    }

    @Test
    void showList() {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.addItem(4); //should be after 5
        list.addItem(5); //should be before 4


    }

    @Test
    void showReverseList() {
    }

    @Test
    void showReverse() {
    }

    @Test
    void find() {
    }

    @Test
    void remove() {
    }
}