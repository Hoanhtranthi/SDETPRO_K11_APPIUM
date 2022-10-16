package lab_11;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static List<MoveAble> getNotFlyAble(List<FlyAble> flyAbles){
        List<MoveAble> racerAnimalsList = new ArrayList<>();
        for ( FlyAble animal :flyAbles ) {
            if (animal.fly() == false)
            {
                racerAnimalsList.add((MoveAble)animal);
            }

        }
        return racerAnimalsList;
    }

    public MoveAble getWinner(List<FlyAble> flyAbles){
        List<MoveAble> racerAnimalsList = AnimalController.getNotFlyAble(flyAbles);
        MoveAble winner = racerAnimalsList.get(0);
        for (MoveAble animal : racerAnimalsList) {
            if (animal.move() > winner.move()){
                winner = animal;
            }

        }
        return winner;
    }
}
