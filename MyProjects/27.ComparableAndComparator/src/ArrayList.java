public class ArrayList<T> {
    private final static  int MAX_SIZE = 10;
    T elements[];
    int count;

    public ArrayList() {
        this.elements = (T[])new Object[MAX_SIZE];
        this.count = 0;
    }


    public void add(T element){
        this.elements[count] = element;
        count++;
    }

 public void print(){
     for (int i = 0; i < count; i++) {
         System.out.println(elements[i]);
     }
 }
}
