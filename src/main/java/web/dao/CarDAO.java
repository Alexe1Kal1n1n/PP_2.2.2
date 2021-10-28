package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {

    private List<Car> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Camry 3.5", 102332, 1993));
        carsList.add(new Car("Lada", 239441,2017));
        carsList.add(new Car("Honda", 432343, 1995));
        carsList.add(new Car("Toyota Supra", 231344, 2003));
        carsList.add(new Car("Nissan Skyline", 855952, 1998));
    }

    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getCarsNumber(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
