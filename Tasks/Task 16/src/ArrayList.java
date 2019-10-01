public class ArrayList {
    int MAX_SIZE = 10;
    int list[];
    int count;


    public ArrayList(){
        this.list = new int[MAX_SIZE];
        this.count = 0;
    }
    void add(int element){
        list[count] = element;
        count++;
    }
    void addToBegin(int element){
        list[0] = element;
    }
    void addToBeginWithAShit(int element){
        for (int i = list.length-1; i >0 ; i--) {
            list[i] = list[i -1];
        }
        list[0] = element;
    }
    void addToEnd(int element){
        list[list.length-1] = element;
    }
    void addToEndWithAShit(int element){
        for (int i = 0; i < list.length-1; i++) {
            list[i] = list[i+1];
        }
        list[list.length-1] = element;
    }
    public int get(int index){
        try {
            return list[index];

        }
        catch (Exception e){
            System.out.println("Такого элемента в массиве нет, длинна массива - " + list.length);
            return -1;
        }
    }

    public void insert(int element, int index){
        for (int i = list.length -1; i > index ; i--) {
            list[i] = list[i-1];
        }
        list[index] = element;
    }

    public void reverse(){
        for (int i = 0; i < list.length/2 ; i++) {
            int temp = list[i];
            list[i] = list[list.length-i-1];
            list[list.length-i-1] = temp;
        }
    }

    public int getCount(){
        return count;
    }

    public void sort(){
        for (int i = 0; i < list.length ; i++) {
            for (int j = i + 1; j < list.length ; j++) {
                if(list[i]>list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public boolean contains(int element){

        for (int i = 0; i < list.length ; i++) {
            if(list[i] == element){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int element){
        for (int i = 0; i < list.length ; i++) {
            if(list[i] == element){
                return i;
            }
        }
        return -1;
    }

    void print(){
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }
    }
}
