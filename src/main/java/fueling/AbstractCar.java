package fueling;

public abstract class AbstractCar implements Car{
    private String name;
    private double distancePerLiter;
    private double distance;

    public AbstractCar(double distance, double distancePerLiter, String name) {
        this.name = name;
        this.distance = distance;
        this.distancePerLiter = distancePerLiter;
    }

    public String getName() {
        return name;
    }

    public double getChargeQuantity() {
        return distance / distancePerLiter;
    }
}
