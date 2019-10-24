public class Circle extends Ellipse {
    public Circle(double x,double y,double radius){//так как круг частный случай овала(овал у которого радиусы равны,то в контруктор
        //передаем только 1 радиус и в оба поля которые мы унаследовали от класса-предка мы передаем один радиус
        super(x,y,radius,radius);
    }
}
