package homework_1;

public class Triangle implements Square{
    private double triangleSide_a;
    private double triangleSide_b;
    private double triangleSide_c;

    public Triangle(double triangleSide_a, double triangleSide_b, double triangleSide_c) {
        this.triangleSide_a = triangleSide_a;
        this.triangleSide_b = triangleSide_b;
        this.triangleSide_c = triangleSide_c;
    }


    @Override
    public double square() {                                //the area of the triangle is determined by Heron's formula
        double height, a, b, c;
        a = Math.pow(triangleSide_a, 2.);
        b = Math.pow(triangleSide_b, 2.);
        c = Math.pow(triangleSide_c, 2.);
        height = 0.5*(b + c - 0.5*(a + Math.pow((b-c), 2.)/a));
        height = Math.sqrt(height);
        return 0.5*triangleSide_a*height;
    }
}
