public class MyClass {
    public String s = "My Call is public";//
    private String s1 = "My Call is private";

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        if (s1.length() > 50){
            System.out.println("Слишком длинная строка");
            return;
        }
        this.s1 = s1;
    }
}
