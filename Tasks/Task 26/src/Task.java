public @interface Task {
    /**
     * На базе SimpleService
     *
     * добавить save/find для модели Автомобиль.
     *
     *У автомобиля есть владелец (Обязательно)
     * users.txt                              cars.txt
     * 123 Anton Fedorov                    75 toyota 123
     * 32  Alexander Krukov(нет машины)     76 priora 123
     *
     * РЕАЛИЗОВАТЬ
     * public interface CarsRepository extends CrudRepository<Car>{
     *     list<Car>findByOwner(User owner);
     *          }
     *
     *
     * Где List - ваш интерфейс,может быть реализован вашим ArrayList или LinkedList.
     */
}
