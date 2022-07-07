package fueling;

public class Avante extends AbstractCar {
    private static final double DISTANCE_PER_LISTER = 15;
    private static final String NAME_OF_CAR = "Avante";

    public Avante(int distance) {
        super(distance, DISTANCE_PER_LISTER, NAME_OF_CAR);
    }

}
