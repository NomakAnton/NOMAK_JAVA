public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.s = "azazaza im xyligan";
        System.out.println(myClass.getS1());
    }
}
/*
Мы создали MyClass в котором есть поля String s и String s1.Переменная s помечена как public а s1 private.Переменную s
можно изменять и вносить в нее какие либо изменения.Переменную s1 мы пометили модификатором private и к ней нельзя о
братиться напрямую.Можно узнать ее состояние посредством метода getS1 и мы добавили метод setS1 чтобы можно было
изменять состояние переменной,но добавили проверку что если длинна строки больше 50 символов то изменение не проходит
 */