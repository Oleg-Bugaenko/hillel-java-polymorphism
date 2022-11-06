package homework_1;

public class Rectangle implements Square {
    private double rectangleSide_a;
    private double rectangleSide_b;



    public Rectangle(double rectangleSide) {
        this.rectangleSide_a = rectangleSide;
        this.rectangleSide_b = rectangleSide;
    }

    public Rectangle(double rectangleSide_a, double rectangleSide_b) {
        this.rectangleSide_a = rectangleSide_a;
        this.rectangleSide_b = rectangleSide_b;
    }


    @Override
    public double square() {
        return rectangleSide_a * rectangleSide_b;
    }
}
