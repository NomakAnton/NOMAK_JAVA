public class Sphere extends Figure implements Scalable {


    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void scale(double value) {
        this.radius = this.radius * value;
    }
}
