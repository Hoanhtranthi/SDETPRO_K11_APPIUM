package lab_10;

import lab_09.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public Animals getWinner(List<Animals> animalList){
        Animals winner = animalList.get(0);
        for (Animals animal: animalList) {
            if (animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }

        }
        return winner;

    }
}
