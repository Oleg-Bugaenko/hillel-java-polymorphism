package homework_2;

public abstract class Overcome {
    private String name;

    public Overcome(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getDistance();

    public abstract boolean overcome(double overcome);
}
