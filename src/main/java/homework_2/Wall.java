package homework_2;

public class Wall extends Overcome{
    private double heightWall;

    public Wall(String name, double heightWall) {
        super(name);
        this.heightWall = heightWall;
    }


    @Override
    public double getDistance() {
        return heightWall;
    }

    @Override
    public boolean overcome(double overcome) {
        return overcome >= heightWall;
    }
}
