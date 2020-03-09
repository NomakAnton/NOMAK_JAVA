package generic;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.addToEnd(5);
        list.addToEnd(6);
        Iterator<Integer> integerIterator = list.iterator();
       // while (integerIterator.hasNext()){
       //     System.out.println(integerIterator.next());
       // }
        for (int number : list){
            System.out.println(number);
        }
    }
}
