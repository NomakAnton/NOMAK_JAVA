package generic;

import java.util.Iterator;
import java.util.Objects;

public class ArrayList<T>implements List<T> {
    private static final int DEFAULT_SIZE = 10;
    private T elements[];
    private int count;

    public ArrayList(){
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.count = 0;
    }

    @Override
    public void addToBegin(T value) {

    }

    @Override
    public void addToEnd(T value) {
        if (count < DEFAULT_SIZE){

            this.elements[count] = value;
            count++;
        }
        else throw new IndexOutOfBoundsException();
    }

    @Override
    public T get(int index) {
        if (index <= count){
            return this.elements[index];
        }
        else throw new IndexOutOfBoundsException();

    }

    @Override
    public int size() {
        return count;
    }
    private class ArrayListIterator implements Iterator{
        private int currentIndex;

        public ArrayListIterator(){
            this.currentIndex = 0;
        }
        @Override
        public boolean hasNext() {
       return currentIndex < count;
        }

        @Override
        public Object next() {
            currentIndex++;
            return elements[currentIndex-1];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }
}
