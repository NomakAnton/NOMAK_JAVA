public class Cat extends Animal {
    public void go(){
        System.out.println("Я кот и я хожу");
    }

    @Override
    public void who() {
        System.out.println("Я кот");
    }
}
