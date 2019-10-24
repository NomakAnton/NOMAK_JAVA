public abstract class Shape {

    private double x;
    private double y;

    public Shape(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double calcPerimeter(){
        return 0;
    }
    public abstract double calcArea();
}
