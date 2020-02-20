import java.util.Comparator;

public class Algorithms {
    public static <T extends Comparable<T>> void sortArrayList(ArrayList<T> list) {
        sort0(list, null);
    }

    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        sort0(list, comparator);
    }

    private static <T> void sort0(ArrayList<T> list, Comparator<T> comparator) {
        int N = list.count;
        Object elements[] = list.elements;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int compareResult = 0;
                if (comparator == null) {
                    compareResult = ((Comparable<T>) elements[j]).compareTo((T) elements[j + 1]);
                } else {
                    compareResult = comparator.compare((T) elements[j], (T) elements[j + 1]);
                }
                if (compareResult > 0) {
                    T temp = (T) elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }

    }
    public static <T extends Comparable<T>> void sortLinkedList(LinkedList<T> list) {
        sort1(list, null);
    }
    public static <T> void sortLinkedList(LinkedList<T> list, Comparator<T> comparator) {
        sort1(list, comparator);
    }
    public static <T> void sort1(LinkedList<T> list, Comparator<T> comparator){
        int N = list.count;
        T value;
        Node current = list.top;
        for (int i = 0; i < list.count - 1 ; i++) {
            for (int j = 0; j < list.count - 1 ; j++) {
                int compareResult = 0;
                if (comparator == null){ compareResult =  ((Comparable<T>) current.getValue()).compareTo((T) current.getNext().getValue());
                }else {
                    compareResult =  comparator.compare((T)current.getValue(),(T)current.getNext().getValue());

                }
                if(compareResult > 0){

                    value = (T)current.getValue();
                    current.setValue(current.getNext().getValue());
                    current.getNext().setValue(value);
                }
                current = current.getNext();
            }
            current = list.top;
        }
    }
}
