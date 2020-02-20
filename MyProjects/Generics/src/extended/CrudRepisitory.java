package extended;

public interface CrudRepisitory<T> {
    void save(T entity);   //Create
    T find(Long id);       //Read
    void update(T entity);//Update
    void delete(T entity);//Delete
}
