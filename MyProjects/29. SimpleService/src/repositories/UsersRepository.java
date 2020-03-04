/**
 * Интерфейс который наследуемый от CRUD и параметризованный типом <User>(так как CRUD работает с многими типами
 * данных, а UsersRepository работает конктретно с User
 */
package repositories;

import models.User;

public interface UsersRepository extends CrudRepository<User> {

}
