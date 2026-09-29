public class Main {
    public static void main(String[] args) {
        CircularLinkedList<Integer> myList = new CircularLinkedList<Integer>(); //creating one with integers in it
        myList.addItem(1);
        myList.addItem(5);
        myList.addItem(3);
        myList.addItem(8);

        myList.showList();


        myList.showReverseList();
        System.out.println();

        myList.find(1);
        myList.find(7);

        myList.remove(5);
        myList.showList();
    }
}
