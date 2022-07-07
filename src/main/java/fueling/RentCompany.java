package fueling;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String SPACE_COLON_SPACE = " : ";
    private static final String LITER = "리터";
    private static List<AbstractCar> rentList = new ArrayList<>();
    private static RentCompany rentCompany = null;

    public static RentCompany create() {
        if (rentCompany == null) {
            return new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(AbstractCar car) {
        rentList.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (AbstractCar car : rentList) {
            sb.append(car.getName())
                    .append(SPACE_COLON_SPACE)
                    .append((int)car.getChargeQuantity()).append(LITER)
                    .append(NEWLINE);
        }
        return sb.toString();
    }
}

