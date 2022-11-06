package homework_1;

public class Cycle implements Square{
    private static final double PI_NUMBER = 3.141592;
    private double radius;

    public Cycle(double radius) {
        this.radius = radius;
    }


    @Override
    public double square() {
        return PI_NUMBER * (radius * radius);
    }
}
