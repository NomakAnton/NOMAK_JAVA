public class Node<T> {
   private T entity;
   private Node next;

    public T getValue() {
        return entity;
    }

    public void setValue(T entity)
    {
        this.entity = entity;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T entity){
       this.entity = entity;
       this.next = null;
   }
}
