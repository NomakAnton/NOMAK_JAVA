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

    }
    void print(){
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }
    }
}
