package fuleing_I;

public class Avante implements Car {
    private final double distancePerLiter = 15;
    private final String name = "Avante";

    private double tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    };
    @Override
    public double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
