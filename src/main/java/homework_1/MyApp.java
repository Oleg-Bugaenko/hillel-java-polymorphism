package homework_1;

public class MyApp {
    public static void main(String[] args) {
        Square[] figures = {
                new Cycle(1.5),
                new Rectangle(2),
                new Rectangle(1.5, 2.3),
                new Triangle(1.2,1.7,2.)
        };
        squareAllFigures(figures);

    }

    public static void squareAllFigures(Square[] figures) {
        double sumSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            sumSquare += figures[i].square();
        }
        System.out.println("The total area of the figures is " + sumSquare);
    }
}
