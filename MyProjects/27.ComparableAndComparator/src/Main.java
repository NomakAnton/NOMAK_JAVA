import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human(25,"Марсель",1.54));
        humans.add(new Human(31,"Алмаз",1.31));
        humans.add(new Human(29,"Антон",1.75));
        humans.add(new Human(45,"Артур",1.73));
        humans.add(new Human(91,"Станислав",1.61));
        humans.add(new Human(41,"Владимир",1.75));
        humans.add(new Human(19,"Алиса",1.73));
        humans.add(new Human(21,"Марина",1.79));
        Algorithms.sort(humans);
        humans.print();
        System.out.println("-------------");
       Comparator<Human> humanComparator = new ByAgeHumansComparator();
       Algorithms.sort(humans,humanComparator);
       humans.print();
        int i = 0;

    }
}
