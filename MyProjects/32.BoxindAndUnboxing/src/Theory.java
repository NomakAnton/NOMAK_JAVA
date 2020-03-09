public class Theory {
    /*

    *Классы-обертки над примитивными типами, например - Integer, Double, Character и т.д.

    №№ Для чего нужны?

    1)Используется в Generics, когда вам необходимо хранить коллекцию примитивных типов. Поскольку Generic все приводят
    к Object, параметризировать их тоже необходимо классами-обертками.

    2)Имеют набор утилитных методов

    Character.isLetter(char c) - проверяет символ буква или нет

    Integer.parseInt(String s) - преобразует строку в число

    3)Допускает значение null

    class User{
    private int id;
    private String name;
    }
    * поле id - проставляется хранилищем данных, после того как созраним объект в системе.
    по умолчаниею поле id = 0;(так как тип поля - int), что может трактоваться как сохраненный объект с id = 0;
    Имеем неоднозначность, то ли объект с проставленным id 0, то ли объект еще не сохранем в системе

    Решение
    class User{
    private Integer id;
    private String name;
    }

    Теперь id = null для всех несохраненных объектов

    №№ Структура оберточных типов
        *Integer
        private final int value;

        *Double
        private final int value;

        *Character
        private final char value;

        Поскольку в каждом оберточном типе поле для хранения значения помечены как final, то следовательно объекты
        данных типов неизменяемы (immutable), как и класс String.

        ##Cashes

        *Существуют у других оберточных типов, расмотрим на примере int

        *Рвссмотрим
        Integer i1 = 130;
        Integer i2 = 130;
        System.out.println(i1 == i2);
        Создается два разных под 130
        i1 - указывает на первый объект, i2 - указывает на второй, следовательно их ссылки не равны и будет false

        Integer i1 = 130;
        Integer i2 = 130;
        System.out.println(i1 == i2);

        * Для чисел от -128 до 127 создается одине объект и i1 и i2 указывают на него.(Похоже на StringPool)
        Как это работает?

          public static Integer valueOf(int i) {
          //если число попадает в границы кеша, то возвращается значение из кеша, если не попали то создаем новый объект
          //кеш  - это массив
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
    Метод valueOf - применяется при автоупаковке
    Intger i1 = 10;//вызывает valueOf

-----------------------------------------------------------------------------------------------------------------------
         private static class IntegerCache {
         //Нижняя граница
        static final int low = -128;
        //Верхняя грацива
        static final int high;
        //массив уже созданных объектов под числа кеша
        static final Integer cache[];

        static {
            //статический инициализатор, инииализирует кеш при загрузке класса в машину
            /Верхняя граница
            int h = 127;
            //если программа была загружена с параметром
            java.lang.Integer.IntegerCache.high
            //если параметр был указан
            String integerCacheHighPropValue =
                VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
            if (integerCacheHighPropValue != null) {
            //преобразуем этот параметр к числу
                try {
                    int i = parseInt(integerCacheHighPropValue);
                    //выбираем максимум между значением которое подали на вход и 127
                    i = Math.max(i, 127);
                  //вычисляем верхнюю границу
                  //минимальное между введеным значение(или 127) и максимальным значением intа + нижняя граница - 1
                  //гарантирует что размер кеша не будет превышать максимальное значение инта
                    h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
                } catch( NumberFormatException nfe) {
                    // If the property cannot be parsed into an int, ignore it.
                }
            }
            //имеем верхнюю границу, например 300
            high = h;
            // создаем кеш размера
            //new Integer(429)
            cache = new Integer[(high - low) + 1];
            //j = 128;
            int j = low;
            //создаем объект для каждого числа
            //-128 -> cache[0]
            //-127 -> cache[1]
            //-126 -> cache[2]
            // 300 -> cache[428]
            for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);

            // range [-128, 127] must be interned (JLS7 5.1.7)
            assert IntegerCache.high >= 127;
        }
------------------------------------------------------------------------------------------------------------------------
     */
}
