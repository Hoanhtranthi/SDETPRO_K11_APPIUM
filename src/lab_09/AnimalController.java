package lab_09;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static Animal getWinner(List<Animal> animalList){
        List<Animal> raceEnableAnimals = getRacerAnimals(animalList);
        Animal winner = animalList.get(0);
        for (Animal animal: raceEnableAnimals) {
            if (animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }

        }
        return winner;

    }
    public static List<Animal> getRacerAnimals(List<Animal> animalList){
        List<Animal> racerAnimalsList = new ArrayList<>();
        for (Animal animal:animalList) {
            if (!animal.isWing()){
                racerAnimalsList.add(animal);
            }

        }
        return racerAnimalsList;
    }
}
