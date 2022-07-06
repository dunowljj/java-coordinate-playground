package fueling;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    List<Car> rentList = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        rentList.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : rentList) {
            sb.append(car.getName()).append(" : ").append((int)car.getChargeQuantity()).append("리터\n");
        }
        return sb.toString();
    }
}

