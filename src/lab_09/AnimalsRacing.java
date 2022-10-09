package lab_09;
import lab_08.lab8_2.Animals;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab_09.Animal.Builder;
import static lab_09.AnimalController.getWinner;

public class AnimalsRacing {
    public static void main(String[] args) {
        final int TIGER_MAX_SPEED = 100;
        final int EAGLE_MAX_SPEED = 100;
        final int FALCON_MAX_SPEED = 100;
        final int SNAKE_MAX_SPEED = 100;
        final int SPARROW_MAX_SPEED = 100;
        final int HORSE_MAX_SPEED = 100;
        Builder builder = new Builder();
        Animal animal = builder.build();
        Animal tiger = new Animal.Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(TIGER_MAX_SPEED)).setWing(false).build();
        Animal eagle = new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(EAGLE_MAX_SPEED)).setWing(true).build();
        Animal falcon = new Animal.Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(FALCON_MAX_SPEED)).setWing(true).build();
        Animal snake = new Animal.Builder().setName("Snake").setSpeed(new SecureRandom().nextInt(SNAKE_MAX_SPEED)).setWing(false).build();
        Animal sparrow = new Animal.Builder().setName("Sparrow").setSpeed(new SecureRandom().nextInt(SPARROW_MAX_SPEED)).setWing(true).build();
        Animal horse = new Animal.Builder().setName("Horse").setSpeed(new SecureRandom().nextInt(HORSE_MAX_SPEED)).setWing(false).build();

        List<Animal> animalList = Arrays.asList(tiger,eagle,falcon,snake,sparrow,horse);
        Animal winner = getWinner(animalList);
        String nameWinner = winner.getName();
        String speedWinner = Integer.toString(winner.getSpeed());
        System.out.println(animalList);
        System.out.print("Winner is " +nameWinner +  ", with speed:" + speedWinner) ;
    }



}
