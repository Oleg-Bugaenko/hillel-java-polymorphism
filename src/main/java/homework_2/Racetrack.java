package homework_2;

public class Racetrack extends Overcome{
    private double lengthRacetrack;

    public Racetrack(String name, double lengthRacetrack) {
        super(name);
        this.lengthRacetrack = lengthRacetrack;
    }

    @Override
    public double getDistance() {
        return lengthRacetrack;
    }

    @Override
    public boolean overcome(double overcome) {
        return overcome >= lengthRacetrack;
    }
}
