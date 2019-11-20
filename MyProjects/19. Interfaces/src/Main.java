public class Main {
    public static void main(String[] args) {
        Box box = new Box(1,2,3,1,1,1);
        Sphere sphere = new Sphere(1,2,1,3);
        Point point = new Point(1,1,2);
        Figure figures[]={box,sphere,point};
        Scalable scalable[] = {box,sphere};

        SpaceOperations.moveALL(figures,1,3,4);
        SpaceOperations.scaleAll(scalable,4);
    }
}
