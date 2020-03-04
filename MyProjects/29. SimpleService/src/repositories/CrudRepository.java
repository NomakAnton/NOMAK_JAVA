/**
 * Интерфейс с методом save (параметризованного типа)(метод который сохраняет "что то", "куда то".
 */
package repositories;
//CREATE, READ, UPDATE, DELETE
public interface CrudRepository<T> {
    void save(T model);
    T find(int id);
}
