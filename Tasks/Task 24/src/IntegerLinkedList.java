public class IntegerLinkedList {
    private Node top;
    private Node tail;
    private int count;

    public IntegerLinkedList() {
        this.top = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void addToBegin(int value){
        Node node = new Node(value);
        if(top == null){
            tail = node;
        }
        node.setNext(top);
        top = node;
        count++;
    }
    public void addToEnd(int value){
        Node node = new Node(value);
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
    public int get(int index){
        int result =-1;
        Node current = top;
        for (int i = 0; i < index ; i++) {
            current = current.getNext();
        }
        result = current.getValue();
        return result;
    }

    public void insert(int value,int index){
        Node node = new Node(value);
        Node current = top;
        for (int i = 0; i <= index-2 ; i++) {
            current = current.getNext();
        }
        node.setNext(current.getNext());
        current.setNext(node);
        count++;

    }
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
    public void remove(int index) {
        Node current = top;
        for (int i = 0; i < index-1 ; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }
    public void sort(){
       int value = 0;
       Node current = top;
        for (int i = 0; i < count - 1 ; i++) {
            for (int j = 0; j < count - 1 ; j++) {
                if (current.getValue() > current.getNext().getValue()){
                    value = current.getValue();
                    current.setValue(current.getNext().getValue());
                    current.getNext().setValue(value);
                }
                current = current.getNext();
            }
            current = top;
        }
    }
    public boolean contains(int element){
        Node current = top;
        while (current != null){
            if (current.getValue() == element){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public int indexOf(int element){
        Node current = top;
        for (int i = 0; i < count; i++) {
            if (current.getValue() == element){
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }



    public void print(){
        Node current = top;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
