import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.addToEnd(25);
        list.addToEnd(13);
        list.addToEnd(54);
        list.addToEnd(12);
        list.addToEnd(9);
        //System.out.println(list.get(3));
        //list.insert(10,3);
       // list.reverse();
        //list.sort();
        list.print();
        System.out.println(list.indexOf(13));

        int i = 0;
    }

}
