public class MainDemo {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.addToBegin(1);
        list.addToBegin(2);
        list.addToBegin(3);
        list.addToBegin(4);
        list.addToBegin(5);

        Node current = list.getTop();


        list.addToEnd(6);
        list.addToEnd(7);
        list.addToEnd(8);
        list.addToEnd(9);
        list.addToEnd(10);
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
