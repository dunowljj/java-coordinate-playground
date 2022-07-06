package fueling;

public class K5 extends Car{
    private final double distancePerLister = 13;
    private final String name = "K5";
    private double tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    @Override
    double getDistancePerLiter() {
        return distancePerLister;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return name;
    }
}
