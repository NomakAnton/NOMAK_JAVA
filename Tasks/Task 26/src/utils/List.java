package utils;

public interface List<T> {
    void addToBegin(T entity);//Create
    void addToEnd(T entity);//Create
    void insert(T entity,int index);//Create
    T get(int index);//Read
    void reverse();
    void remove(int index);//Delete
    boolean contains(T entity);
    int indexOf(T entity);
    Iterator iterator();
}
