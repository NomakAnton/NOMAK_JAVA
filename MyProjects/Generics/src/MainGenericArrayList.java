public class MainGenericArrayList {
    public static void main(String[] args) {
        GenericArrayList <Integer> integerList = new GenericArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(6);


        int integerValue = integerList.get(2);
        System.out.println(integerValue);

    }
}
