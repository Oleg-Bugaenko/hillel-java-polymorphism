package homework_2;

public class Robot implements Contestant {
    private String name;
    private double maxRunningDistance;
    private double maxJumpingHeight;

    public Robot(String name, double maxRunningDistance, double maxJumpingHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingHeight = maxJumpingHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean running(Overcome overcome) {
        boolean completedTest = overcome.overcome(maxRunningDistance);

        if(completedTest) {
            System.out.printf("Робот %s пробіг %s з дистанцією %s \n", name, overcome.getName(), overcome.getDistance());
        } else {
            System.out.printf("Робот %s не зміг пробігти %s з дистанцією %s. Максимальна дистанція пройдена кандидатом %s \n",
                    name, overcome.getName(), overcome.getDistance(), maxRunningDistance);
        }
        return completedTest;
    }

    @Override
    public boolean jumping(Overcome overcome) {
        boolean completedTest = overcome.overcome(maxJumpingHeight);

        if(completedTest) {
            System.out.printf("Робот %s перестрибнув(ла) перешкоду %s висотою %s \n", name, overcome.getName(), overcome.getDistance());
        } else {
            System.out.printf("Робот %s не зміг(ла) перестрибнути перешкоду %s висотою %s. Максимальний стрибок кандидата %s \n",
                    name, overcome.getName(), overcome.getDistance(), maxJumpingHeight);
        }
        return completedTest;
    }
}
