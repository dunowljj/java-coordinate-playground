package fueling;

public class Sonata extends AbstractCar {
    private static final double DISTANCE_PER_LISTER = 10;
    private static final String NAME_OF_CAR = "Sonata";
    public Sonata(int distance) {
        super(distance, DISTANCE_PER_LISTER, NAME_OF_CAR);
    }
}
