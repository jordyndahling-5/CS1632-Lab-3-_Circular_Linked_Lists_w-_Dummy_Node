import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        list.showList();
        System.setOut(originalOut);

        assertEquals("5 4 " + System.lineSeparator(), output.toString());

    }

    @Test
    void showReverseList() {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.addItem(4); //should be after 5
        list.addItem(5); //should be before 4

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        list.showReverseList();
        System.setOut(originalOut);

        assertEquals("4 5 " + System.lineSeparator(), output.toString());
    }

    @Test
    void find() {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.addItem(4); //should be after 5
        list.addItem(5); //should be before 4

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        //is there
        list.find(4);
        System.setOut(originalOut);

        assertEquals("value found!" + System.lineSeparator(), output.toString());

        //is not there
        ByteArrayOutputStream output2 = new ByteArrayOutputStream();
        PrintStream originalOut2 = System.out;
        System.setOut(new PrintStream(output2));
        //is there
        list.find(7);
        System.setOut(originalOut2);
        assertEquals("value not in list" +System.lineSeparator(), output2.toString());


    }

    @Test
    void remove() {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.addItem(4); //should be after 5
        list.addItem(5); //should be before 4

        list.remove(5);

        assertEquals(Integer.valueOf(4), list.getFirst().next.data);
        assertEquals(list.getFirst(), list.getFirst().next.next); //since after removal there is only one node other than the dummy,
                                                                    // two nexts would get you back to the first node
    }
}