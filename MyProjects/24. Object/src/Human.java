public class Human {
    private int age;
    private double height;

    public Human(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public boolean equals(Object object){
        if(object== this){
            return true;
        }
        //instanceOf - not good
        if (object== null  || object.getClass() != (this.getClass())){
            return false;
        }
        Human that = (Human)object;
        return this.age == that.age &&
                this.height == that.height;

    }
    @Override
    public String toString(){
        return this.age + " " + this.height;
    }

}
