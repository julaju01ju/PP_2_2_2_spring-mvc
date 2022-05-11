package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car ("Car1", "Red", 1111));
        cars.add(new Car ("Car2", "Black", 2222));
        cars.add(new Car ("Car3", "White", 3333));
        cars.add(new Car ("Car4", "Yellow", 4444));
        cars.add(new Car ("Car5", "Blue", 5555));
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return cars.subList(0, count);
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
