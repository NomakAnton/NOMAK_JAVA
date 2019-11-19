public class Main {
    public static void main(String[] args) {
        System.out.println(SomeClass.staticField);
        SomeClass aObject = new SomeClass();
        SomeClass bObject = new SomeClass();
        aObject.field = 10;
        aObject.staticField = 50;
        bObject.field = 15;
        bObject.staticField = 200;
        System.out.println(aObject.field);
        System.out.println(bObject.field);
        System.out.println(aObject.staticField);
        System.out.println(bObject.staticField);
        SomeClass.staticField = 500;
        aObject.objectMethodForIncrementStaticField();
        SomeClass.staticMethodForIncrementStaticField();
        System.out.println(SomeClass.staticField);


    }
}
