public class LinkedList<T> implements List<T> {
    Node top;
    Node tail;
    int count;

    public LinkedList() {
        this.top = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }
    @Override
    public void addToBegin(T elements){
        Node node = new Node(elements);
        if(top == null){
            tail = node;
        }
        node.setNext(top);
        top = node;
        count++;
    }
    @Override
    public void addToEnd(T elements){
        Node node = new Node(elements);
        if(top == null){
            top = node;
            tail= top;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
        count ++;
    }
    @Override
    public T get(int index){
        T result ;
        Node current = top;
        for (int i = 0; i < index ; i++) {
            current = current.getNext();
        }
        result =(T)current.getValue();
        return result;
    }
    @Override
    public void insert(T elements,int index){
        Node node = new Node(elements);
        Node current = top;
        for (int i = 0; i <= index-2 ; i++) {
            current = current.getNext();
        }
        node.setNext(current.getNext());
        current.setNext(node);
        count++;

    }
    @Override
    public void reverse(){
        Node current = top;
        Node newTop = tail;
        Node newTail = tail;
        for (int i = count; i > 0 ; i--) {
            for (int j = 0; j < i-1 ; j++) {
                current = current.getNext();
            }
            newTail.setNext(current);
            newTail = current;
            current = top;
        }
        top = newTop;
        tail = newTail;
        tail.setNext(null);

    }
    @Override
    public void remove(int index) {
        Node current = top;
        if(index == 0){
           top = top.getNext();
            return;
        }
        for (int i = 0; i < index-2 ; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }



    public boolean contains(T elements){
        Node current = top;
        while (current != null){
            if (current.getValue().equals(elements)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public int indexOf(T elements){
        Node current = top;
        for (int i = 0; i < count; i++) {
            if (current.getValue().equals(elements)){
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }
    private class LinkedListIterator implements Iterator{
        Node current;
        public LinkedListIterator(){
            this.current = top;
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = (T)current.getValue();
            current = current.getNext();
            return value;
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }


    public void print(){
        Node current = top;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
