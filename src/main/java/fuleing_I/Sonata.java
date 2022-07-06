package fuleing_I;

public class Sonata implements Car {
    private final double distancePerLiter = 10;
    private final String name = "Sonata";
    private double tripDistance;

    public Sonata(int tripDistance) {
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
