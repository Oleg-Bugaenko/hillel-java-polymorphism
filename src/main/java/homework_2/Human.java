package homework_2;

public class Human implements Contestant {
    private String name;
    private double maxRunningDistance;
    private double maxJumpingHeight;


    public Human(String name, double maxRunningDistance, double maxJumpingHeight) {
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
            System.out.printf("Людина %s пробіг(ла) %s з дистанцією %s \n", name, overcome.getName(), overcome.getDistance());
        } else {
            System.out.printf("Людина %s не зміг(ла) пробігти %s з дистанцією %s. Максимальна дистанція пройдена кандидатом %s \n",
                    name, overcome.getName(), overcome.getDistance(), maxRunningDistance);
        }
        return completedTest;
    }



    @Override
    public boolean jumping(Overcome overcome) {
        boolean completedTest = overcome.overcome(maxJumpingHeight);

        if(completedTest) {
            System.out.printf("Людина %s перестрибнув(ла) перешкоду %s висотою %s \n", name, overcome.getName(), overcome.getDistance());
        } else {
            System.out.printf("Людина %s не зміг(ла) перестрибнути перешкоду %s висотою %s. Максимальний стрибок кандидата %s \n",
                    name, overcome.getName(), overcome.getDistance(), maxJumpingHeight);
        }
        return completedTest;
    }







}
