package ru.itpark;

public class Theory {
    /*
    Паттерн - шаблон, для решения типичных проблем.Метод решения какой то проблемы и задачи.

    Паттерн Singleton
    Проблема - необходимость гарантийного существования только одного экхепляра класса(единственный объект)

    *Решение - применить паттерн Singleton.
    ##
    Суть
    *Паттерн Singleton с неленивой инициализацией.
*/
    class Singleton{
        //объектная переменная - ссылка на единственный экземпляр объекта
        private Singleton instance;
        //заюлокированный конструктор
        private Singleton(){

        }
        //Статический инифиализатор создающий единственный объект при загрузке класса JVM
        static {
            instance = new Singleton();
        }
        //Метод для получения единственного экземпляра класса
        public static Singleton getInstance(){
            return  instance;
        }
    }

}
