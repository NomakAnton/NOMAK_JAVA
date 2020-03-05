package repositories;

public interface CrudRepository<T> {
    void save(T model);
    T findById(int id);
}
