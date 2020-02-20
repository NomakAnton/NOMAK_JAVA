public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.addToEnd(25);
        integerArrayList.addToEnd(41);
        integerArrayList.addToEnd(1);
        integerArrayList.addToEnd(3);
        integerArrayList.addToEnd(123);
        integerArrayList.addToEnd(41);
        integerArrayList.addToEnd(5);
        integerArrayList.addToEnd(3);
        integerArrayList.addToEnd(14);
        integerArrayList.addToEnd(63);
       Iterator iterator = integerArrayList.iterator();
       LinkedList<Integer>integerLinkedList = new LinkedList<>();
       integerLinkedList.addToEnd(412);
       integerLinkedList.addToEnd(501);
       integerLinkedList.addToEnd(31);
       integerLinkedList.addToEnd(3);
       integerLinkedList.addToEnd(21);
       integerLinkedList.addToEnd(123);
       integerLinkedList.addToEnd(5123);
       integerArrayList.remove(2);
       //Iterator iterator1 = integerLinkedList.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }


    }
}
