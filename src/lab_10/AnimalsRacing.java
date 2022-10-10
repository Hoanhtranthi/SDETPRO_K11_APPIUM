package lab_10;

import lab_08.lab8_2.AnimalsController;
import lab_09.Animal;

import java.util.Arrays;
import java.util.List;

public class AnimalsRacing {
    public static void main(String[] args) {
        Animals tiger = new Tiger().setSpeed().setName();
        Animals dog = new Dog().setSpeed().setName();
        Animals horse = new Horse().setSpeed().setName();

        AnimalController animalController = new AnimalController();
        List<Animals> animalsList = Arrays.asList(tiger,dog,horse);
        Animals winner = animalController.getWinner(animalsList);
        String nameWinner = winner.getName();
        String speedWinner = Integer.toString(winner.getSpeed());
        System.out.println(animalsList);
        System.out.print("Winner is " +nameWinner +  ", with speed:" + speedWinner) ;
    }
}
