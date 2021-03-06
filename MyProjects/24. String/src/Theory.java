public class Theory {
    /*
    ## Класс String

    * Структура класса
    final class String{
    private final char value[];//массив символов, который хранит саму строку
    }
    final - ключевое слово, означающее что от этого класса нельзя наследоваться

    *Любой метод класса String, предназначенный для изменения стоки (например, выделение подстроки, удаление символа и т.д.)
    ВСЕГДА порождает новый объект.

    *Строки в Java неизменяемые. Нет никакой возможности изменить массив символов


    *StringPool. При таком коде
    String s1 = "marsel";
        String s2 = "marsel";

        System.out.println(s1 == s2);

        Результат будет -true. Хотя нелогично так как объекты разные,на них разные ссылки. Java видит что строки одинаковые и присваивает обе ссылки
        на один и тот же объект
        String s3 = new String("Marsel");
        String s4 = new String("Marsel");
        System.out.println(s3 == s4);
        Результат - false, так как здесь мы явно создали 2 новых объекта.

        СРАВНИВАТЬ STRING - через equals


        *метод intern - смотрит, есть ли строка, из которой был вызван intern в StringPool, если есть - возвращает ссылку на нее из StringPool, если
        нет - то помещает в StringPool и возвращает ссылку на нее.

     */
}
