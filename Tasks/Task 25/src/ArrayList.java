public class ArrayList<T> implements List<T> {
   private int MAX_SIZE = 10;
    T elements[];
   int count;


    public ArrayList(){
        this.elements = (T[])new  Object[MAX_SIZE];
        this.count = 0;
    }

    @Override
    public void addToBegin(T element){
        for (int i = elements.length-1; i >0 ; i--) {
            elements[i] = elements[i -1];
        }
        elements[0] = element;
        count++;
    }
    @Override
    public void addToEnd(T element){
        for (int i = 0; i < elements.length-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[elements.length-1] = element;
        count++;
    }
    @Override
    public T get(int index){
        try {
            return elements[index];

        }
        catch (Exception e){
            System.out.println("Такого элемента в массиве нет, длинна массива - " + elements.length);
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public void insert(T element, int index){
        if(elements[index] == null){
            elements[index] = element;
            return;
        }
        for (int i = elements.length -1; i > index ; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
    }
    @Override
    public void reverse(){
        for (int i = 0; i < elements.length/2 ; i++) {
            T temp = elements[i];
            elements[i] = elements[elements.length-i-1];
            elements[elements.length-i-1] = temp;
        }
    }

    @Override
    public void remove(int index) {
        if(index<count && index>=0){
            elements[index] = null;
            for (int i = index; i < elements.length -1 ; i++) {
                elements[i] = elements[i+1];
            }

        }
        else throw new IndexOutOfBoundsException();
    }

    public int getCount(){
        return count;
    }


   @Override
    public boolean contains(T element){

        for (int i = 0; i < elements.length ; i++) {
            if(elements[i] == element){
                return true;
            }
        }
        return false;
    }
@Override
    public int indexOf(T element){
        for (int i = 0; i < elements.length ; i++) {
            if(elements[i] == element){
                return i;
            }
        }
        return -1;
    }
    private class ArrayListIterator implements Iterator{
         int current;
        public ArrayListIterator(){
            this.current = 0;
        }
        @Override
        public boolean hasNext() {
            if(current < count){
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            T value = elements[current];
            current++;
            return value;
        }
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }


    void print(){
        for (int i = 0; i < elements.length ; i++) {

            System.out.println(elements[i]);
        }
    }
}
