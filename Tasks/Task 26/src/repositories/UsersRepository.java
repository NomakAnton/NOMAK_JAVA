package repositories;

import models.User;

public interface UsersRepository extends CrudRepository<User> {
    public User findByLastName(String lastName);
}
