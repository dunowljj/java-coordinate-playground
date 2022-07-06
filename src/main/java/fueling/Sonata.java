package fueling;

public class Sonata extends Car{
    private final double distancePerLister = 10;
    private final String name = "Sonata";
    private double tripDistance;

    public Sonata(int tripDistance) {
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
