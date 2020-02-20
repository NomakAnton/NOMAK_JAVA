import java.util.Comparator;

public class ByAgeHumansComparator implements Comparator<Human> {
    @Override
    public int compare(Human human, Human t1) {
        return human.getAge()-t1.getAge();
    }
}
