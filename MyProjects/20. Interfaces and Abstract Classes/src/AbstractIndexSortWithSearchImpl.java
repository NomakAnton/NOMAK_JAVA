public abstract class AbstractIndexSortWithSearchImpl implements Index {
    public static final int MAX_INDEX_SIZE = 10;
    private int values[];
    private int count;

    public AbstractIndexSortWithSearchImpl(){
        this.values = new int[MAX_INDEX_SIZE];
        this.count = 0;
    }


    @Override
    public void put(int value) {
        this.values[count] = value;
        count++;
    }

    @Override
    public boolean contains(int value) {
        return search(value )!=-1;
    }
    public abstract void sort();
    public abstract int search(int value);
}
