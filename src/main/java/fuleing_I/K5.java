package fuleing_I;

public class K5 implements Car {
    private final double distancePerLiter = 13;
    private final String name = "K5";
    private double tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }
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
