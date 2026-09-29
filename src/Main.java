public class Main {
    public static void main(String[] args) {
        CircularLinkedList<Integer> myList = new CircularLinkedList<Integer>(); //creating one with integers in it
        myList.addItem(1);
        myList.addItem(5);

        myList.showList();
        System.out.println();

        myList.showReverseList();
    }
}
