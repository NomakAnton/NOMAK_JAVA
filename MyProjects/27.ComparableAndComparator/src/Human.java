public class Human implements Comparable<Human> {

    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    private String name;
    private double height;

    public Human(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Human o) {
        return Double.compare(this.height,o.height);
    }

//   @Override
//   public int compareTo(Human o) {
//       return this.age - o.age;
//   }

    public String toString(){
        return this.name + " " + this.age + " " + this.height;
    }
}
