public class Box extends  Figure implements Scalable {

    private double height;
    private double lenght;
    private double wight;


    public Box(double x, double y, double z, double height, double lenght, double wight) {
       super(x, y, z);
        this.height = height;
        this.lenght = lenght;
        this.wight = wight;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public void scale(double value) {
        this.height *= value;
        this.lenght *= value;
        this.wight *= value;
    }
}
