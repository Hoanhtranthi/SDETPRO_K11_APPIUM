package lab_11;

import lab_09.Animal;
import lab_10.Animals;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Falcon falcon = new Falcon();
        Horse horse = new Horse();
        Snake snake = new Snake();
        Sparrow sparrow = new Sparrow();

        AnimalController animalController = new AnimalController();
        List<FlyAble> animalList = Arrays.asList(dog,eagle,falcon,snake,sparrow,horse);
        MoveAble winner = animalController.getWinner(animalList);
        String nameWinner = winner.getName();
        String speedWinner = Integer.toString(winner.move());
        System.out.println(animalList);
        System.out.print("Winner is " +nameWinner +  ", with speed:" + speedWinner) ;
    }
}
