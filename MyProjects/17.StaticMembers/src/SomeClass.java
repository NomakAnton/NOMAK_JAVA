public class SomeClass {
    int field;
    static int staticField;
    static {
        staticField = 1000;
    }

    void objectMethodForIncrementStaticField(){
        staticField++;
    }
    static void staticMethodForIncrementStaticField(){
        staticField++;
    }
}
