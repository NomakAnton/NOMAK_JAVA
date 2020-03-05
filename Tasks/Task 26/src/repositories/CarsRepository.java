package repositories;

import models.Car;
import models.User;
import utils.List;

public interface CarsRepository extends CrudRepository<Car> {
    public List<Car> findByOwner(User owner);

}

