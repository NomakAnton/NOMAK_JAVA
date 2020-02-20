public class MainIntegerAndString {
    public static void main(String[] args) {
        ObjectArrayList integerList = new ObjectArrayList();

        integerList.add(1);
        ObjectArrayList stringList = new ObjectArrayList();
        stringList.add("hello");

        int valueFromIntegerList = (int)integerList.get(0);
        String stringFromIntegerList = (String)stringList.get(0);
        System.out.println(valueFromIntegerList + " " + stringFromIntegerList);
    }
}
