public class MainQuestions {
}
/*
Конструктор не является членом класса!

1.Классическая задача на интервью

Есть массив с возрастами людей.Необходимо как можно быстрее посчитать какой возраст встречается чаще всего.
Или к примеру есть массив с рандомными числами,как быстрее всего посчитать какой число встречается чаще всего?
int arrayRandomInt = new int[100];
Создаем массив такой же длинны что и массив с рандомными числами.
int array = new int[arrayRandomInt.length];

for(int i = 0; i < array.length; i++){
    array[arrayRandomInt[i]]++;
}
То есть мы ячейку которая соответсвует значению в массиве со случайными числами увеличиваем на 1 при нахождении такого числа
 */