package homework_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        //block
        Overcome[] blocks = {
                new Wall("wall_1", 2.0),
                new Racetrack("track_1", 150),
                new Wall("wall_2", 3.0),
                new Racetrack("track_2", 3000),
                new Wall("wall_3", 5.0),
                new Racetrack("track_2", 21_000),
        };

       //Starters
        List<Contestant> contestants = new ArrayList<>(Arrays.asList(
                new Human("Alex", 3000, 2.4),
                new Cat("Simon", 200, 3.2),
                new Robot("C-3PO", 5000, 4),
                new Robot("T-1000", 30000, 5)
        ));


        System.out.println("-- ПОЧИНАЄМО ЗМАГАННЯ -- \n");
        for (Overcome block: blocks) {
            System.out.println("Наступна перешкода - " + block.getName());

            for (int i = 0; i < contestants.size(); i++) {
                boolean check = true;
                Contestant contestant = contestants.get(i);

                if (block instanceof Wall) check = contestant.jumping(block);
                if (block instanceof Racetrack) check = contestant.running(block);

                if (!check) {
                    System.out.printf(" --- Учасник - %s на ім'я %s вибув із змагань \n", contestant.getClass().getSimpleName(), contestant.getName());
                    contestants.remove(contestant);
                    i--;
                }
            }
            System.out.println("-----------------------------------");
        }

    }
}
