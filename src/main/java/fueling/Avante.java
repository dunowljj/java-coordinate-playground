package fueling;

public class Avante extends Car{
    private final double distancePerLister = 15;
    private final String name = "Avante";
    private double tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    };
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
